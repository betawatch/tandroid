package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LetterDrawable;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.spoilers.SpoilerEffect;

/* loaded from: classes4.dex */
public class SharedLinkCell extends FrameLayout {
    private StaticLayout captionLayout;
    private TextPaint captionTextPaint;
    private int captionY;
    private CheckBox2 checkBox;
    private boolean checkingForLongPress;
    private StaticLayout dateLayout;
    private int dateLayoutX;
    private SharedLinkCellDelegate delegate;
    private TextPaint description2TextPaint;
    private int description2Y;
    private StaticLayout descriptionLayout;
    private StaticLayout descriptionLayout2;
    private List descriptionLayout2Spoilers;
    private List descriptionLayoutSpoilers;
    private TextPaint descriptionTextPaint;
    private int descriptionY;
    private boolean drawLinkImageView;
    private StaticLayout fromInfoLayout;
    private AnimatedEmojiSpan.EmojiGroupedSpans fromInfoLayoutEmojis;
    private int fromInfoLayoutY;
    private LetterDrawable letterDrawable;
    private ImageReceiver linkImageView;
    private ArrayList linkLayout;
    private boolean linkPreviewPressed;
    private SparseArray linkSpoilers;
    private int linkY;
    ArrayList links;
    private LinkSpanDrawable.LinkCollector linksCollector;
    private MessageObject message;
    private boolean needDivider;
    private AtomicReference patchedDescriptionLayout;
    private AtomicReference patchedDescriptionLayout2;
    private Path path;
    private CheckForLongPress pendingCheckForLongPress;
    private CheckForTap pendingCheckForTap;
    private int pressCount;
    private LinkSpanDrawable pressedLink;
    private int pressedLinkIndex;
    private Theme.ResourcesProvider resourcesProvider;
    private SpoilerEffect spoilerPressed;
    private int spoilerTypePressed;
    private Stack spoilersPool;
    private StaticLayout titleLayout;
    private TextPaint titleTextPaint;
    private int titleY;
    private int viewType;

    public interface SharedLinkCellDelegate {
        boolean canPerformActions();

        void needOpenWebView(TLRPC.WebPage webPage, MessageObject messageObject);

        void onLinkPress(String str, boolean z);
    }

    static /* synthetic */ int access$104(SharedLinkCell sharedLinkCell) {
        int i = sharedLinkCell.pressCount + 1;
        sharedLinkCell.pressCount = i;
        return i;
    }

    private final class CheckForTap implements Runnable {
        private CheckForTap() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SharedLinkCell.this.pendingCheckForLongPress == null) {
                SharedLinkCell sharedLinkCell = SharedLinkCell.this;
                sharedLinkCell.pendingCheckForLongPress = sharedLinkCell.new CheckForLongPress();
            }
            SharedLinkCell.this.pendingCheckForLongPress.currentPressCount = SharedLinkCell.access$104(SharedLinkCell.this);
            SharedLinkCell sharedLinkCell2 = SharedLinkCell.this;
            sharedLinkCell2.postDelayed(sharedLinkCell2.pendingCheckForLongPress, ViewConfiguration.getLongPressTimeout() - ViewConfiguration.getTapTimeout());
        }
    }

    class CheckForLongPress implements Runnable {
        public int currentPressCount;

        CheckForLongPress() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SharedLinkCell.this.checkingForLongPress && SharedLinkCell.this.getParent() != null && this.currentPressCount == SharedLinkCell.this.pressCount) {
                SharedLinkCell.this.checkingForLongPress = false;
                try {
                    SharedLinkCell.this.performHapticFeedback(0);
                } catch (Exception unused) {
                }
                if (SharedLinkCell.this.pressedLinkIndex >= 0) {
                    SharedLinkCellDelegate sharedLinkCellDelegate = SharedLinkCell.this.delegate;
                    SharedLinkCell sharedLinkCell = SharedLinkCell.this;
                    sharedLinkCellDelegate.onLinkPress(((CharSequence) sharedLinkCell.links.get(sharedLinkCell.pressedLinkIndex)).toString(), true);
                }
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                SharedLinkCell.this.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
    }

    protected void startCheckLongPress() {
        if (this.checkingForLongPress) {
            return;
        }
        this.checkingForLongPress = true;
        if (this.pendingCheckForTap == null) {
            this.pendingCheckForTap = new CheckForTap();
        }
        postDelayed(this.pendingCheckForTap, ViewConfiguration.getTapTimeout());
    }

    protected void cancelCheckLongPress() {
        this.checkingForLongPress = false;
        CheckForLongPress checkForLongPress = this.pendingCheckForLongPress;
        if (checkForLongPress != null) {
            removeCallbacks(checkForLongPress);
        }
        CheckForTap checkForTap = this.pendingCheckForTap;
        if (checkForTap != null) {
            removeCallbacks(checkForTap);
        }
    }

    public SharedLinkCell(Context context, int i) {
        this(context, i, null);
    }

    public SharedLinkCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.checkingForLongPress = false;
        this.pendingCheckForLongPress = null;
        this.pressCount = 0;
        this.pendingCheckForTap = null;
        this.linksCollector = new LinkSpanDrawable.LinkCollector(this);
        this.links = new ArrayList();
        this.linkLayout = new ArrayList();
        this.linkSpoilers = new SparseArray();
        this.descriptionLayoutSpoilers = new ArrayList();
        this.descriptionLayout2Spoilers = new ArrayList();
        this.spoilersPool = new Stack();
        this.path = new Path();
        this.spoilerTypePressed = -1;
        this.titleY = AndroidUtilities.dp(10.0f);
        this.descriptionY = AndroidUtilities.dp(30.0f);
        this.patchedDescriptionLayout = new AtomicReference();
        this.description2Y = AndroidUtilities.dp(30.0f);
        this.patchedDescriptionLayout2 = new AtomicReference();
        this.captionY = AndroidUtilities.dp(30.0f);
        this.fromInfoLayoutY = AndroidUtilities.dp(30.0f);
        this.resourcesProvider = resourcesProvider;
        this.viewType = i;
        setFocusable(true);
        TextPaint textPaint = new TextPaint(1);
        this.titleTextPaint = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        this.titleTextPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        this.descriptionTextPaint = new TextPaint(1);
        this.titleTextPaint.setTextSize(AndroidUtilities.dp(14.0f));
        this.descriptionTextPaint.setTextSize(AndroidUtilities.dp(14.0f));
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.linkImageView = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(8.0f));
        this.letterDrawable = new LetterDrawable(resourcesProvider, 0);
        CheckBox2 checkBox2 = new CheckBox2(context, 21, resourcesProvider);
        this.checkBox = checkBox2;
        checkBox2.setVisibility(4);
        this.checkBox.setColor(-1, Theme.key_windowBackgroundWhite, Theme.key_checkboxCheck);
        this.checkBox.setDrawUnchecked(false);
        this.checkBox.setDrawBackgroundAsArc(2);
        CheckBox2 checkBox22 = this.checkBox;
        boolean z = LocaleController.isRTL;
        addView(checkBox22, LayoutHelper.createFrame(24, 24.0f, (z ? 5 : 3) | 48, z ? 0.0f : 44.0f, 44.0f, z ? 44.0f : 0.0f, 0.0f));
        if (i == 1) {
            TextPaint textPaint2 = new TextPaint(1);
            this.description2TextPaint = textPaint2;
            textPaint2.setTextSize(AndroidUtilities.dp(13.0f));
        }
        TextPaint textPaint3 = new TextPaint(1);
        this.captionTextPaint = textPaint3;
        textPaint3.setTextSize(AndroidUtilities.dp(13.0f));
    }

    private void gatherLink(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        String trim = str.trim();
        if (trim.startsWith("#")) {
            return;
        }
        if (!AndroidUtilities.charSequenceContains(trim, "://") && trim.toString().toLowerCase().indexOf("http") != 0 && trim.toString().toLowerCase().indexOf("mailto") != 0) {
            trim = "http://" + trim;
        }
        this.links.add(SpannableString.valueOf(trim));
    }

    private void gatherRichMessageLinks(TL_iv.RichText richText) {
        if (richText instanceof TL_iv.textUrl) {
            gatherLink(richText.url);
            return;
        }
        if (richText instanceof TL_iv.textAutoUrl) {
            gatherLink(RichMessageLayout.getString(richText));
            return;
        }
        if (richText instanceof TL_iv.textEmail) {
            gatherLink("mailto:" + ((TL_iv.textEmail) richText).email);
            return;
        }
        if (richText instanceof TL_iv.textAutoEmail) {
            gatherLink("mailto:" + RichMessageLayout.getString(richText));
            return;
        }
        if (richText instanceof TL_iv.textConcat) {
            for (int i = 0; i < richText.texts.size(); i++) {
                gatherRichMessageLinks(richText.texts.get(i));
            }
            return;
        }
        if ((richText instanceof TL_iv.textBold) || (richText instanceof TL_iv.textItalic) || (richText instanceof TL_iv.textUnderline) || (richText instanceof TL_iv.textStrike) || (richText instanceof TL_iv.textFixed) || (richText instanceof TL_iv.textSubscript) || (richText instanceof TL_iv.textSuperscript) || (richText instanceof TL_iv.textMarked) || (richText instanceof TL_iv.textAnchor)) {
            gatherRichMessageLinks(richText.text);
        }
    }

    private void gatherRichMessageLinks(TL_iv.PageBlock pageBlock) {
        if ((pageBlock instanceof TL_iv.pageBlockParagraph) || (pageBlock instanceof TL_iv.pageBlockHeading1) || (pageBlock instanceof TL_iv.pageBlockHeading2) || (pageBlock instanceof TL_iv.pageBlockHeading3) || (pageBlock instanceof TL_iv.pageBlockHeading4) || (pageBlock instanceof TL_iv.pageBlockHeading5) || (pageBlock instanceof TL_iv.pageBlockHeading6) || (pageBlock instanceof TL_iv.pageBlockPreformatted) || (pageBlock instanceof TL_iv.pageBlockFooter) || (pageBlock instanceof TL_iv.pageBlockBlockquote) || (pageBlock instanceof TL_iv.pageBlockPullquote)) {
            gatherRichMessageLinks(pageBlock.text);
        } else if (pageBlock instanceof TL_iv.pageBlockCover) {
            gatherRichMessageLinks(((TL_iv.pageBlockCover) pageBlock).cover);
        } else if (pageBlock instanceof TL_iv.pageBlockBlockquoteBlocks) {
            gatherRichMessageLinks(((TL_iv.pageBlockBlockquoteBlocks) pageBlock).blocks);
        }
    }

    private void gatherRichMessageLinks(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            gatherRichMessageLinks((TL_iv.PageBlock) obj);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0709  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0477 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0429 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x03ba A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0216 A[Catch: Exception -> 0x012d, TryCatch #3 {Exception -> 0x012d, blocks: (B:52:0x0117, B:54:0x011b, B:57:0x0120, B:60:0x0126, B:63:0x0136, B:65:0x0169, B:68:0x0216, B:70:0x021e, B:72:0x022e, B:74:0x023e, B:75:0x0252, B:111:0x0177, B:114:0x018c, B:116:0x0190, B:118:0x01a4, B:120:0x01aa, B:122:0x01b8, B:124:0x01bf, B:126:0x01c5, B:128:0x01cf, B:129:0x01d5, B:130:0x01f1, B:132:0x01f5, B:134:0x0203, B:135:0x01a0), top: B:51:0x0117 }] */
    /* JADX WARN: Type inference failed for: r2v48, types: [android.text.Spannable, android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r2v86, types: [android.text.Spannable, android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v26 */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 2026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.SharedLinkCell.onMeasure(int, int):void");
    }

    public void setLink(MessageObject messageObject, boolean z) {
        this.needDivider = z;
        resetPressedLink();
        this.message = messageObject;
        requestLayout();
    }

    public ImageReceiver getLinkImageView() {
        return this.linkImageView;
    }

    public void setDelegate(SharedLinkCellDelegate sharedLinkCellDelegate) {
        this.delegate = sharedLinkCellDelegate;
    }

    public MessageObject getMessage() {
        return this.message;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.drawLinkImageView) {
            this.linkImageView.onDetachedFromWindow();
        }
        AnimatedEmojiSpan.release(this, this.fromInfoLayoutEmojis);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.drawLinkImageView) {
            this.linkImageView.onAttachedToWindow();
        }
        this.fromInfoLayoutEmojis = AnimatedEmojiSpan.update(0, this, this.fromInfoLayoutEmojis, this.fromInfoLayout);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0222  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        SharedLinkCellDelegate sharedLinkCellDelegate;
        boolean z2;
        int i;
        int i2;
        int i3;
        String str;
        TLRPC.MessageMedia messageMedia;
        if (this.message != null && !this.linkLayout.isEmpty() && (sharedLinkCellDelegate = this.delegate) != null && sharedLinkCellDelegate.canPerformActions()) {
            if (motionEvent.getAction() == 0 || ((this.linkPreviewPressed || this.spoilerPressed != null) && motionEvent.getAction() == 1)) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    if (i4 >= this.linkLayout.size()) {
                        z = false;
                        z2 = false;
                        break;
                    }
                    StaticLayout staticLayout = (StaticLayout) this.linkLayout.get(i4);
                    if (staticLayout.getLineCount() > 0) {
                        int lineBottom = staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
                        int dp = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline);
                        float f = x;
                        float f2 = dp;
                        if (f < staticLayout.getLineLeft(0) + f2 || f > staticLayout.getLineWidth(0) + f2 || y < (i3 = this.linkY + i5) || y > i3 + lineBottom) {
                            i5 += lineBottom;
                        } else {
                            TLRPC.WebPage webPage = null;
                            if (motionEvent.getAction() == 0) {
                                this.spoilerPressed = null;
                                if (this.linkSpoilers.get(i4, null) != null) {
                                    Iterator it = ((List) this.linkSpoilers.get(i4)).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        SpoilerEffect spoilerEffect = (SpoilerEffect) it.next();
                                        if (spoilerEffect.getBounds().contains(x - dp, (y - this.linkY) - i5)) {
                                            resetPressedLink();
                                            this.spoilerPressed = spoilerEffect;
                                            this.spoilerTypePressed = 0;
                                            break;
                                        }
                                    }
                                }
                                if (this.spoilerPressed == null && (this.pressedLinkIndex != i4 || this.pressedLink == null || !this.linkPreviewPressed)) {
                                    resetPressedLink();
                                    this.pressedLinkIndex = i4;
                                    LinkSpanDrawable linkSpanDrawable = new LinkSpanDrawable(null, this.resourcesProvider, x - dp, (y - this.linkY) - i5);
                                    this.pressedLink = linkSpanDrawable;
                                    LinkPath obtainNewPath = linkSpanDrawable.obtainNewPath();
                                    this.linkPreviewPressed = true;
                                    this.linksCollector.addLink(this.pressedLink);
                                    startCheckLongPress();
                                    try {
                                        obtainNewPath.setCurrentLayout(staticLayout, 0, f2, this.linkY + i5);
                                        staticLayout.getSelectionPath(0, staticLayout.getText().length(), obtainNewPath);
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                }
                            } else if (this.linkPreviewPressed) {
                                try {
                                    if (this.pressedLinkIndex == 0 && (messageMedia = this.message.messageOwner.media) != null) {
                                        webPage = messageMedia.webpage;
                                    }
                                    if (webPage != null && (str = webPage.embed_url) != null && str.length() != 0) {
                                        this.delegate.needOpenWebView(webPage, this.message);
                                    } else {
                                        this.delegate.onLinkPress(((CharSequence) this.links.get(this.pressedLinkIndex)).toString(), false);
                                    }
                                } catch (Exception e2) {
                                    FileLog.e(e2);
                                }
                                resetPressedLink();
                            } else if (this.spoilerPressed != null) {
                                startSpoilerRipples(x, y, i5);
                            } else {
                                z = false;
                                z2 = true;
                            }
                            z = true;
                            z2 = true;
                        }
                    }
                    i4++;
                }
                if (motionEvent.getAction() == 0) {
                    int dp2 = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline);
                    StaticLayout staticLayout2 = this.descriptionLayout;
                    if (staticLayout2 != null && x >= dp2 && x <= staticLayout2.getWidth() + dp2 && y >= (i2 = this.descriptionY) && y <= i2 + this.descriptionLayout.getHeight()) {
                        Iterator it2 = this.descriptionLayoutSpoilers.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            SpoilerEffect spoilerEffect2 = (SpoilerEffect) it2.next();
                            if (spoilerEffect2.getBounds().contains(x - dp2, y - this.descriptionY)) {
                                this.spoilerPressed = spoilerEffect2;
                                this.spoilerTypePressed = 1;
                                z = true;
                                z2 = true;
                                break;
                            }
                        }
                    }
                    StaticLayout staticLayout3 = this.descriptionLayout2;
                    if (staticLayout3 != null && x >= dp2 && x <= staticLayout3.getWidth() + dp2 && y >= (i = this.description2Y) && y <= i + this.descriptionLayout2.getHeight()) {
                        for (SpoilerEffect spoilerEffect3 : this.descriptionLayout2Spoilers) {
                            if (spoilerEffect3.getBounds().contains(x - dp2, y - this.description2Y)) {
                                this.spoilerPressed = spoilerEffect3;
                                this.spoilerTypePressed = 2;
                                z = true;
                                z2 = true;
                                break;
                            }
                        }
                    }
                    if (!z2) {
                        resetPressedLink();
                    }
                } else {
                    if (motionEvent.getAction() == 1 && this.spoilerPressed != null) {
                        startSpoilerRipples(x, y, 0);
                        z = true;
                        z2 = true;
                        break;
                    }
                    if (!z2) {
                    }
                }
                return z || super.onTouchEvent(motionEvent);
            }
            if (motionEvent.getAction() == 3) {
                resetPressedLink();
            }
        } else {
            resetPressedLink();
        }
        z = false;
        if (z) {
            return true;
        }
    }

    private void startSpoilerRipples(int i, int i2, int i3) {
        int dp = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline);
        resetPressedLink();
        this.spoilerPressed.setOnRippleEndCallback(new Runnable() { // from class: org.telegram.ui.Cells.SharedLinkCell$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                SharedLinkCell.$r8$lambda$KtNjZWwSpUwdIZT146obVDMUTAs(SharedLinkCell.this);
            }
        });
        int i4 = i - dp;
        float sqrt = (float) Math.sqrt(Math.pow(getWidth(), 2.0d) + Math.pow(getHeight(), 2.0d));
        int i5 = this.spoilerTypePressed;
        if (i5 == 0) {
            float f = 0.0f;
            for (int i6 = 0; i6 < this.linkLayout.size(); i6++) {
                Layout layout = (Layout) this.linkLayout.get(i6);
                f += layout.getLineBottom(layout.getLineCount() - 1);
                Iterator it = ((List) this.linkSpoilers.get(i6)).iterator();
                while (it.hasNext()) {
                    ((SpoilerEffect) it.next()).startRipple(i4, ((i2 - getYOffsetForType(0)) - i3) + f, sqrt);
                }
            }
        } else if (i5 == 1) {
            Iterator it2 = this.descriptionLayoutSpoilers.iterator();
            while (it2.hasNext()) {
                ((SpoilerEffect) it2.next()).startRipple(i4, i2 - getYOffsetForType(1), sqrt);
            }
        } else if (i5 == 2) {
            Iterator it3 = this.descriptionLayout2Spoilers.iterator();
            while (it3.hasNext()) {
                ((SpoilerEffect) it3.next()).startRipple(i4, i2 - getYOffsetForType(2), sqrt);
            }
        }
        for (int i7 = 0; i7 <= 2; i7++) {
            if (i7 != this.spoilerTypePressed) {
                if (i7 == 0) {
                    for (int i8 = 0; i8 < this.linkLayout.size(); i8++) {
                        Layout layout2 = (Layout) this.linkLayout.get(i8);
                        layout2.getLineBottom(layout2.getLineCount() - 1);
                        Iterator it4 = ((List) this.linkSpoilers.get(i8)).iterator();
                        while (it4.hasNext()) {
                            ((SpoilerEffect) it4.next()).startRipple(r1.getBounds().centerX(), r1.getBounds().centerY(), sqrt);
                        }
                    }
                } else if (i7 == 1) {
                    Iterator it5 = this.descriptionLayoutSpoilers.iterator();
                    while (it5.hasNext()) {
                        ((SpoilerEffect) it5.next()).startRipple(r13.getBounds().centerX(), r13.getBounds().centerY(), sqrt);
                    }
                } else if (i7 == 2) {
                    Iterator it6 = this.descriptionLayout2Spoilers.iterator();
                    while (it6.hasNext()) {
                        ((SpoilerEffect) it6.next()).startRipple(r13.getBounds().centerX(), r13.getBounds().centerY(), sqrt);
                    }
                }
            }
        }
        this.spoilerTypePressed = -1;
        this.spoilerPressed = null;
    }

    public static /* synthetic */ void $r8$lambda$KtNjZWwSpUwdIZT146obVDMUTAs(final SharedLinkCell sharedLinkCell) {
        sharedLinkCell.getClass();
        sharedLinkCell.post(new Runnable() { // from class: org.telegram.ui.Cells.SharedLinkCell$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                SharedLinkCell.$r8$lambda$dNONtQFtBlY2WaZBv6WDIvsAgZs(SharedLinkCell.this);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$dNONtQFtBlY2WaZBv6WDIvsAgZs(SharedLinkCell sharedLinkCell) {
        sharedLinkCell.message.isSpoilersRevealed = true;
        sharedLinkCell.linkSpoilers.clear();
        sharedLinkCell.descriptionLayoutSpoilers.clear();
        sharedLinkCell.descriptionLayout2Spoilers.clear();
        sharedLinkCell.invalidate();
    }

    private int getYOffsetForType(int i) {
        if (i == 1) {
            return this.descriptionY;
        }
        if (i != 2) {
            return this.linkY;
        }
        return this.description2Y;
    }

    public String getLink(int i) {
        if (i < 0 || i >= this.links.size()) {
            return null;
        }
        return ((CharSequence) this.links.get(i)).toString();
    }

    protected void resetPressedLink() {
        this.linksCollector.clear(true);
        this.pressedLinkIndex = -1;
        this.pressedLink = null;
        this.linkPreviewPressed = false;
        cancelCheckLongPress();
        invalidate();
    }

    public void setChecked(boolean z, boolean z2) {
        if (this.checkBox.getVisibility() != 0) {
            this.checkBox.setVisibility(0);
        }
        this.checkBox.setChecked(z, z2);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        SharedLinkCell sharedLinkCell;
        Canvas canvas2 = canvas;
        if (this.viewType == 1) {
            this.description2TextPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText3, this.resourcesProvider));
        }
        if (this.dateLayout != null) {
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline) + (LocaleController.isRTL ? 0 : this.dateLayoutX), this.titleY);
            this.dateLayout.draw(canvas2);
            canvas2.restore();
        }
        if (this.titleLayout != null) {
            canvas2.save();
            float dp = AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline);
            if (LocaleController.isRTL) {
                dp += this.dateLayout == null ? 0.0f : r2.getWidth() + AndroidUtilities.dp(4.0f);
            }
            canvas2.translate(dp, this.titleY);
            this.titleLayout.draw(canvas2);
            canvas2.restore();
        }
        if (this.captionLayout != null) {
            this.captionTextPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.captionY);
            this.captionLayout.draw(canvas2);
            canvas2.restore();
        }
        if (this.descriptionLayout != null) {
            this.descriptionTextPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.descriptionY);
            SpoilerEffect.renderWithRipple(this, false, this.descriptionTextPaint.getColor(), -AndroidUtilities.dp(2.0f), this.patchedDescriptionLayout, 0, this.descriptionLayout, this.descriptionLayoutSpoilers, canvas2, false);
            canvas2.restore();
        }
        if (this.descriptionLayout2 != null) {
            this.descriptionTextPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), this.description2Y);
            SpoilerEffect.renderWithRipple(this, false, this.descriptionTextPaint.getColor(), -AndroidUtilities.dp(2.0f), this.patchedDescriptionLayout2, 0, this.descriptionLayout2, this.descriptionLayout2Spoilers, canvas2, false);
            sharedLinkCell = this;
            canvas2.restore();
        } else {
            sharedLinkCell = this;
        }
        if (!sharedLinkCell.linkLayout.isEmpty()) {
            sharedLinkCell.descriptionTextPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteLinkText, sharedLinkCell.resourcesProvider));
            int i = 0;
            for (int i2 = 0; i2 < sharedLinkCell.linkLayout.size(); i2++) {
                StaticLayout staticLayout = (StaticLayout) sharedLinkCell.linkLayout.get(i2);
                List list = (List) sharedLinkCell.linkSpoilers.get(i2);
                if (staticLayout.getLineCount() > 0) {
                    canvas2.save();
                    canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), sharedLinkCell.linkY + i);
                    sharedLinkCell.path.rewind();
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            Rect bounds = ((SpoilerEffect) it.next()).getBounds();
                            sharedLinkCell.path.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
                        }
                    }
                    canvas2.save();
                    canvas2.clipPath(sharedLinkCell.path, Region.Op.DIFFERENCE);
                    staticLayout.draw(canvas2);
                    canvas2.restore();
                    canvas2.save();
                    canvas2.clipPath(sharedLinkCell.path);
                    sharedLinkCell.path.rewind();
                    if (list != null && !list.isEmpty()) {
                        ((SpoilerEffect) list.get(0)).getRipplePath(sharedLinkCell.path);
                    }
                    canvas2.clipPath(sharedLinkCell.path);
                    staticLayout.draw(canvas2);
                    canvas2.restore();
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            ((SpoilerEffect) it2.next()).draw(canvas2);
                        }
                    }
                    canvas2.restore();
                    i += staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
                }
            }
            if (sharedLinkCell.linksCollector.draw(canvas2)) {
                sharedLinkCell.invalidate();
            }
        }
        if (sharedLinkCell.fromInfoLayout != null) {
            canvas2.save();
            canvas2.translate(AndroidUtilities.dp(LocaleController.isRTL ? 8.0f : AndroidUtilities.leftBaseline), sharedLinkCell.fromInfoLayoutY);
            sharedLinkCell.fromInfoLayout.draw(canvas2);
            AnimatedEmojiSpan.drawAnimatedEmojis(canvas, sharedLinkCell.fromInfoLayout, sharedLinkCell.fromInfoLayoutEmojis, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas2 = canvas;
            canvas2.restore();
        }
        sharedLinkCell.letterDrawable.draw(canvas2);
        if (sharedLinkCell.drawLinkImageView) {
            sharedLinkCell.linkImageView.draw(canvas2);
        }
        if (sharedLinkCell.needDivider) {
            if (LocaleController.isRTL) {
                canvas2.drawLine(0.0f, sharedLinkCell.getMeasuredHeight() - 1, sharedLinkCell.getMeasuredWidth() - AndroidUtilities.dp(AndroidUtilities.leftBaseline), sharedLinkCell.getMeasuredHeight() - 1, Theme.dividerPaint);
            } else {
                canvas.drawLine(AndroidUtilities.dp(AndroidUtilities.leftBaseline), sharedLinkCell.getMeasuredHeight() - 1, sharedLinkCell.getMeasuredWidth(), sharedLinkCell.getMeasuredHeight() - 1, Theme.dividerPaint);
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        StaticLayout staticLayout = this.titleLayout;
        if (staticLayout != null) {
            sb.append(staticLayout.getText());
        }
        if (this.descriptionLayout != null) {
            sb.append(", ");
            sb.append(this.descriptionLayout.getText());
        }
        if (this.descriptionLayout2 != null) {
            sb.append(", ");
            sb.append(this.descriptionLayout2.getText());
        }
        accessibilityNodeInfo.setText(sb.toString());
        if (this.checkBox.isChecked()) {
            accessibilityNodeInfo.setChecked(true);
            accessibilityNodeInfo.setCheckable(true);
        }
    }
}
