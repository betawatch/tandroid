package ai;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.tv;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class db extends View {
    public static Object I;
    public static Vector J;
    public int E;
    public CharSequence F;
    public int G;
    public ValueAnimator H;
    public final org.telegram.ui.ActionBar.d6 a;
    public final TextPaint b;
    public final PorterDuffColorFilter c;
    public StaticLayout d;
    public float e;
    public org.telegram.ui.Components.v5 f;
    public final h90 h;
    public final Path n;
    public final ArrayList r;
    public final ArrayList s;
    public boolean v;
    public boolean w;
    public final Object x;
    public float y;

    public db(Context context, int i10, TLObject tLObject, Object obj, boolean z10, ArrayList arrayList, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        Vector vector;
        this.G = -12;
        this.a = d6Var;
        setMinimumWidth(AndroidUtilities.dp(196.0f));
        setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        setBackground(org.telegram.ui.ActionBar.h6.Y(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.i6, d6Var), 0, 8));
        setClickable(true);
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        int i11 = org.telegram.ui.ActionBar.h6.E8;
        textPaint.setColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        this.c = new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i11, d6Var), PorterDuff.Mode.SRC_IN);
        h90 h90Var = new h90(d6Var);
        this.h = h90Var;
        h90Var.setCallback(this);
        h90Var.e(org.telegram.ui.ActionBar.h6.l1(0.2f, -1), org.telegram.ui.ActionBar.h6.l1(0.05f, -1));
        Path path = new Path();
        this.n = path;
        h90Var.x = path;
        h90Var.j(4.0f);
        boolean[] zArr = {true};
        this.x = obj;
        if (!z10) {
            this.v = true;
            this.w = false;
            ArrayList arrayList2 = new ArrayList();
            this.s = arrayList2;
            arrayList2.addAll(arrayList);
            if (this.s.size() == 1) {
                MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) this.s.get(0), 0, false, new ab(this, 0));
                return;
            } else {
                set(this.s.size());
                d(false);
                return;
            }
        }
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.v = false;
        this.w = false;
        TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.Photo photo = (TLRPC.Photo) tLObject;
            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputStickeredMediaPhoto.id = tL_inputPhoto;
            tL_inputPhoto.id = photo.id;
            tL_inputPhoto.access_hash = photo.access_hash;
            byte[] bArr = photo.file_reference;
            tL_inputPhoto.file_reference = bArr;
            if (bArr == null) {
                tL_inputPhoto.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaPhoto;
        } else if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = new TLRPC.TL_inputStickeredMediaDocument();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputStickeredMediaDocument.id = tL_inputDocument;
            tL_inputDocument.id = document.id;
            tL_inputDocument.access_hash = document.access_hash;
            byte[] bArr2 = document.file_reference;
            tL_inputDocument.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputDocument.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
        }
        ya yaVar = new ya(this, obj, arrayList, zArr, i10, 0);
        if (I != obj || (vector = J) == null) {
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getAttachedStickers, new za(obj, i10, tL_messages_getAttachedStickers, yaVar, 0));
        } else {
            zArr[0] = false;
            yaVar.run(vector, null);
        }
    }

    public static /* synthetic */ void a(db dbVar, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i10) {
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            I = obj;
            J = vector;
            for (int i11 = 0; i11 < vector.objects.size(); i11++) {
                TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i11);
                dbVar.r.add(stickerSetCovered);
                TLRPC.StickerSet stickerSet = stickerSetCovered.set;
                if (stickerSet != null) {
                    dbVar.s.add(MediaDataController.getInputStickerSet(stickerSet));
                    TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                    if (stickerSet2.emojis) {
                        dbVar.v = true;
                    } else if (!stickerSet2.masks) {
                        dbVar.w = true;
                    }
                }
            }
            int size = arrayList != null ? arrayList.size() : 0;
            ArrayList arrayList2 = dbVar.r;
            int size2 = size + (arrayList2 == null ? 0 : arrayList2.size());
            if (dbVar.s != null && arrayList != null && !arrayList.isEmpty()) {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(i12);
                    long j3 = inputStickerSet.id;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= dbVar.s.size()) {
                            dbVar.s.add(inputStickerSet);
                            break;
                        } else if (((TLRPC.InputStickerSet) dbVar.s.get(i13)).id == j3) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
                dbVar.v = true;
            }
            if (size2 != 1) {
                dbVar.set(size2);
            } else if (dbVar.r.size() >= 1) {
                dbVar.set((TLRPC.StickerSetCovered) dbVar.r.get(0));
            } else {
                if (arrayList != null && arrayList.size() >= 1) {
                    zArr[0] = false;
                    MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) arrayList.get(0), 0, false, new ab(dbVar, 1));
                    return;
                }
                dbVar.set(0);
            }
            dbVar.d(zArr[0]);
        }
    }

    public static /* synthetic */ void b(db dbVar, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        dbVar.set(tL_messages_stickerSet);
        dbVar.d(false);
    }

    public static /* synthetic */ void c(db dbVar, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        dbVar.set(tL_messages_stickerSet);
        dbVar.d(true);
    }

    private void set(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        CharSequence charSequence;
        if (tL_messages_stickerSet == null) {
            return;
        }
        SpannableString spannableString = new SpannableString("x " + tL_messages_stickerSet.set.title);
        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.gc, this.h.a)), 0, spannableString.length(), 33);
        spannableString.setSpan(new e51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                document = null;
                break;
            } else {
                if (arrayList.get(i10).id == tL_messages_stickerSet.set.thumb_document_id) {
                    document = arrayList.get(i10);
                    break;
                }
                i10++;
            }
        }
        if (document == null && !arrayList.isEmpty()) {
            document = arrayList.get(0);
        }
        if (document != null) {
            spannableString.setSpan(new org.telegram.ui.Components.z5(document, this.b.getFontMetricsInt()), 0, 1, 33);
            charSequence = spannableString;
        } else {
            charSequence = spannableString.subSequence(2, spannableString.length());
        }
        boolean z10 = this.v;
        setText(AndroidUtilities.replaceCharSequence("%s", (z10 && this.w) ? LocaleController.getString(R.string.StoryContainsStickersEmojiFrom) : z10 ? LocaleController.getString(R.string.StoryContainsEmojiFrom) : LocaleController.getString(R.string.StoryContainsStickersFrom), charSequence));
    }

    public final void d(boolean z10) {
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z10) {
            this.y = 1.0f;
            invalidate();
            post(new a3.d(this, 19));
            return;
        }
        int i10 = 0;
        boolean z11 = true;
        this.H = ValueAnimator.ofFloat(this.y, 1.0f);
        if (this.d != null && Math.abs(getMeasuredHeight() - (getPaddingBottom() + (this.d.getHeight() + getPaddingTop()))) <= AndroidUtilities.dp(3.0f)) {
            z11 = false;
        }
        this.H.addUpdateListener(new bb(i10, this, z11));
        this.H.setInterpolator(rr.h);
        this.H.setStartDelay(150L);
        this.H.setDuration(400L);
        this.H.start();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.y;
        if (f7 < 1.0f) {
            h90 h90Var = this.h;
            h90Var.setAlpha((int) ((1.0f - f7) * 255.0f));
            Path path = this.n;
            path.rewind();
            float paddingLeft = getPaddingLeft();
            float paddingTop = getPaddingTop();
            float measuredWidth = getMeasuredWidth() - getPaddingRight();
            float dp = AndroidUtilities.dp(12.0f) + getPaddingTop();
            Path.Direction direction = Path.Direction.CW;
            path.addRect(paddingLeft, paddingTop, measuredWidth, dp, direction);
            path.addRect(getPaddingLeft(), AndroidUtilities.dp(16.0f) + getPaddingTop(), (((getMeasuredWidth() - getPaddingRight()) - getPaddingLeft()) * 0.46f) + getPaddingLeft(), AndroidUtilities.dp(28.0f) + getPaddingTop(), direction);
            h90Var.draw(canvas);
            invalidate();
        }
        if (this.d != null) {
            if (this.y > 0.0f) {
                canvas.save();
                canvas.translate(getPaddingLeft() - (LocaleController.isRTL ? 0.0f : this.e), getPaddingTop());
                this.b.setAlpha((int) (this.y * 255.0f));
                this.d.draw(canvas);
                org.telegram.ui.Components.z5.drawAnimatedEmojis(canvas, this.d, this.f, 0.0f, null, 0.0f, 0.0f, 0.0f, this.y, this.c);
                canvas.restore();
            }
        }
    }

    public tv getAlert() {
        if (this.s != null) {
            return new tv(null, getContext(), this.a, this.s);
        }
        int i10 = -this.G;
        this.G = i10;
        AndroidUtilities.shakeViewSpring(this, i10);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        return null;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10 = View.MeasureSpec.getMode(i10) == 1073741824;
        int paddingTop = getPaddingTop();
        int dp = AndroidUtilities.dp(29.0f);
        StaticLayout staticLayout = this.d;
        setMeasuredDimension(z10 ? View.MeasureSpec.getSize(i10) : getMinimumWidth(), getPaddingBottom() + AndroidUtilities.lerp(dp, staticLayout == null ? AndroidUtilities.dp(29.0f) : staticLayout.getHeight(), this.y) + paddingTop);
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        if (z10) {
            CharSequence charSequence = this.F;
            if (charSequence == null && (this.d == null || this.E == size)) {
                return;
            }
            if (charSequence == null) {
                charSequence = this.d.getText();
            }
            setText(charSequence);
            this.F = null;
            this.E = size;
        }
    }

    public void setText(CharSequence charSequence) {
        if (getMeasuredWidth() <= 0) {
            this.F = charSequence;
            return;
        }
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        if (measuredWidth <= 0) {
            this.F = charSequence;
            return;
        }
        StaticLayout staticLayout = new StaticLayout(charSequence, this.b, measuredWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        this.e = staticLayout.getLineCount() > 0 ? this.d.getLineLeft(0) : 0.0f;
        if (this.d.getLineCount() > 0) {
            this.d.getLineWidth(0);
        }
        this.f = org.telegram.ui.Components.z5.update(0, this, this.f, this.d);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.h || super.verifyDrawable(drawable);
    }

    private void set(TLRPC.StickerSetCovered stickerSetCovered) {
        CharSequence charSequence;
        String string;
        SpannableString spannableString = new SpannableString("x " + stickerSetCovered.set.title);
        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.gc, this.h.a)), 0, spannableString.length(), 33);
        spannableString.setSpan(new e51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null && (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered)) {
            ArrayList<TLRPC.Document> arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (arrayList.get(i10).id == stickerSetCovered.set.thumb_document_id) {
                    document = arrayList.get(i10);
                }
            }
            if (document == null && !arrayList.isEmpty()) {
                document = arrayList.get(0);
            }
        }
        if (document != null) {
            spannableString.setSpan(new org.telegram.ui.Components.z5(document, this.b.getFontMetricsInt()), 0, 1, 33);
            charSequence = spannableString;
        } else {
            charSequence = spannableString.subSequence(2, spannableString.length());
        }
        boolean z10 = this.v;
        if (z10 && this.w) {
            string = LocaleController.getString(R.string.StoryContainsStickersEmojiFrom);
        } else if (z10) {
            string = LocaleController.getString(R.string.StoryContainsEmojiFrom);
        } else {
            string = LocaleController.getString(R.string.StoryContainsStickersFrom);
        }
        setText(AndroidUtilities.replaceCharSequence("%s", string, charSequence));
    }

    private void set(int i10) {
        boolean z10 = this.v;
        h90 h90Var = this.h;
        if (z10 && this.w) {
            setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryContainsStickersEmoji", i10, new Object[0]), 0, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.gc, h90Var.a), null));
        } else if (z10) {
            setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryContainsEmoji", i10, new Object[0]), 0, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.gc, h90Var.a), null));
        } else {
            setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryContainsStickers", i10, new Object[0]), 0, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.gc, h90Var.a), null));
        }
    }
}
