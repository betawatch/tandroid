package eg;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import dg.y2;
import java.util.ArrayList;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.j5;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.u5;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.gw0;
import org.telegram.ui.pb1;
import org.telegram.ui.ww0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class e2 extends sa implements NotificationCenter.NotificationCenterDelegate {
    public TLRPC.TL_emojiStatusCollectible A0;
    public boolean B0;
    public final int[] C0;
    public float D0;
    public boolean E0;
    public ValueAnimator F0;
    public boolean G0;
    public boolean H0;
    public FrameLayout I0;
    public final FrameLayout J0;
    public FrameLayout K0;
    public f90[] L0;
    public f90 M0;
    public final ArrayList U;
    public int V;
    public final TLRPC.User W;
    public final n X;
    public final TL_stars.StarGift Y;
    public boolean Z;
    public final gw0 a0;
    public int b0;
    public int c0;
    public int d0;
    public int e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public final s00 l0;
    public final q1 m0;
    public h n0;
    public i o0;
    public pb1 p0;
    public final org.telegram.ui.ActionBar.p2 q0;
    public Integer r0;
    public float s0;
    public float t0;
    public float u0;
    public float v0;
    public float w0;
    public View x0;
    public View y0;
    public TLRPC.InputStickerSet z0;

    public e2(org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.User user, f6 f6Var) {
        this(p2Var, i10, user, null, null, f6Var);
    }

    public static /* synthetic */ void P(e2 e2Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(e2Var.z0);
        y1 y1Var = new y1(e2Var, 0);
        org.telegram.ui.ActionBar.p2 p2Var = e2Var.q0;
        if (p2Var != null) {
            y1Var.setParentFragment(p2Var);
        }
        new z1(e2Var, y1Var, e2Var.getContext(), e2Var.resourcesProvider, arrayList).show();
    }

    @Override // org.telegram.ui.Components.sa
    public final void D(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i12 = 0;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.U;
            if (i12 >= arrayList.size()) {
                this.b0 = i13;
                this.container.getLocationOnScreen(this.C0);
                return;
            }
            ww0 ww0Var = (ww0) arrayList.get(i12);
            gw0 gw0Var = this.a0;
            gw0Var.a(ww0Var, false);
            gw0Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
            ((ww0) arrayList.get(i12)).e = i13;
            i13 += gw0Var.getMeasuredHeight();
            i12++;
        }
    }

    @Override // org.telegram.ui.Components.sa
    public final void F(qv0 qv0Var) {
        this.V = UserConfig.selectedAccount;
        c1 c1Var = new c1(getContext(), this.resourcesProvider, false);
        c1Var.a(PremiumPreviewFragment.o0(this.V, null), new androidx.mediarouter.app.c(this, 6), false);
        this.I0 = new FrameLayout(getContext());
        View view = new View(getContext());
        view.setBackgroundColor(getThemedColor(j6.d7));
        this.I0.addView(view, b6.c(1.0f, -1));
        view.getLayoutParams().height = 1;
        AndroidUtilities.updateViewVisibilityAnimated(view, true, 1.0f, false);
        if (UserConfig.getInstance(this.V).isPremium() || (this instanceof gg.m1)) {
            return;
        }
        this.I0.addView(c1Var, b6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        this.I0.setBackgroundColor(getThemedColor(j6.h5));
        qv0Var.addView(this.I0, b6.e(-1, 68, 80));
    }

    public void W(pb1 pb1Var) {
        pb1Var.addView(this.y0, b6.p(140, 140, 1.0f, 17, 10, 10, 10, 10));
    }

    public int X() {
        return 0;
    }

    public View Z(Context context, int i10) {
        return null;
    }

    public void a0(boolean z4) {
        TLRPC.Document document;
        SpannableStringBuilder spannableStringBuilder;
        f90[] f90VarArr = this.L0;
        if (f90VarArr == null || this.M0 == null) {
            return;
        }
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.A0;
        int i10 = 2;
        int i11 = 1;
        TLRPC.User user = this.W;
        int i12 = 0;
        if (tL_emojiStatusCollectible != null) {
            String str = tL_emojiStatusCollectible.title;
            int lastIndexOf = str.lastIndexOf(32);
            if (lastIndexOf >= 0) {
                str = str.substring(0, lastIndexOf);
            }
            this.L0[0].setText(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TelegramPremiumUserStatusCollectibleDialogTitle, DialogObject.getShortName(user), str), new u1(this, i12)));
            org.telegram.ui.b.n(R.string.TelegramPremiumUserStatusDialogSubtitle, this.M0);
        } else if (this.z0 != null) {
            String formatString = LocaleController.formatString(R.string.TelegramPremiumUserStatusDialogTitle, ContactsController.formatName(user.first_name, user.last_name), "<STICKERSET>");
            Integer num = this.r0;
            CharSequence replaceSingleLink = AndroidUtilities.replaceSingleLink(formatString, num == null ? getThemedColor(j6.u6) : num.intValue());
            try {
                replaceSingleLink = Emoji.replaceEmoji(replaceSingleLink, this.L0[0].getPaint().getFontMetricsInt(), false);
            } catch (Exception unused) {
            }
            SpannableStringBuilder spannableStringBuilder2 = replaceSingleLink instanceof SpannableStringBuilder ? (SpannableStringBuilder) replaceSingleLink : new SpannableStringBuilder(replaceSingleLink);
            int indexOf = replaceSingleLink.toString().indexOf("<STICKERSET>");
            if (indexOf >= 0) {
                TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.V).getStickerSet(this.z0, false);
                if (stickerSet == null || stickerSet.documents.isEmpty()) {
                    document = null;
                } else {
                    document = stickerSet.documents.get(0);
                    if (stickerSet.set != null) {
                        int i13 = 0;
                        while (true) {
                            if (i13 >= stickerSet.documents.size()) {
                                break;
                            }
                            if (stickerSet.documents.get(i13).id == stickerSet.set.thumb_document_id) {
                                document = stickerSet.documents.get(i13);
                                break;
                            }
                            i13++;
                        }
                    }
                }
                if (document != null) {
                    spannableStringBuilder = new SpannableStringBuilder("x");
                    spannableStringBuilder.setSpan(new u5(document, this.L0[0].getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                    if (stickerSet != null && stickerSet.set != null) {
                        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) stickerSet.set.title);
                    }
                } else {
                    spannableStringBuilder = new SpannableStringBuilder("xxxxxx");
                    spannableStringBuilder.setSpan(new k90(AndroidUtilities.dp(100.0f), this.L0[0]), 0, spannableStringBuilder.length(), 33);
                }
                spannableStringBuilder2.replace(indexOf, indexOf + 12, (CharSequence) spannableStringBuilder);
                spannableStringBuilder2.setSpan(new l0(this, i11), indexOf, spannableStringBuilder.length() + indexOf, 33);
                this.L0[1].setOnLinkPressListener(new e90() { // from class: eg.v1
                    @Override // org.telegram.ui.Components.e90
                    public final void a(ClickableSpan clickableSpan) {
                        e2.P(e2.this);
                    }
                });
                if (document != null) {
                    f90[] f90VarArr2 = this.L0;
                    if (f90VarArr2 != null) {
                        f90VarArr2[1].setText(spannableStringBuilder2);
                        if (this.L0[1].getVisibility() != 0) {
                            if (z4) {
                                this.L0[1].setAlpha(0.0f);
                                this.L0[1].setVisibility(0);
                                ViewPropertyAnimator alpha = this.L0[1].animate().alpha(1.0f);
                                mr mrVar = mr.f;
                                org.telegram.ui.b.p(alpha, mrVar, 200L);
                                this.L0[0].animate().alpha(0.0f).setInterpolator(mrVar).setDuration(200L).withEndAction(new u1(this, i10)).start();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new x1(this, i11));
                                ofFloat.setInterpolator(mrVar);
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                            } else {
                                this.L0[1].setAlpha(1.0f);
                                this.L0[1].setVisibility(0);
                                this.L0[0].setAlpha(0.0f);
                                this.L0[0].setVisibility(8);
                            }
                        }
                    }
                } else {
                    this.L0[0].setText(spannableStringBuilder2, (TextView.BufferType) null);
                }
            }
            org.telegram.ui.b.n(R.string.TelegramPremiumUserStatusDialogSubtitle, this.M0);
        } else if (this.B0) {
            f90VarArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.TelegramPremiumUserStatusDefaultDialogTitle, ContactsController.formatName(user.first_name, user.last_name))));
            this.M0.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.TelegramPremiumUserStatusDialogSubtitle, ContactsController.formatName(user.first_name, user.last_name))));
        } else {
            n nVar = this.X;
            if (nVar == null) {
                TL_stars.StarGift starGift = this.Y;
                if (starGift != null) {
                    f90VarArr[0].setText(LocaleController.getString(R.string.Gift2PremiumTitle));
                    this.L0[0].setTextSize(1, 20.0f);
                    if (starGift.limited_per_user) {
                        this.M0.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PremiumSubtitleMany", starGift.per_user_total)));
                    } else {
                        org.telegram.ui.b.n(R.string.Gift2PremiumSubtitle, this.M0);
                    }
                    this.M0.setTextSize(1, 14.0f);
                } else if (user == null) {
                    f90VarArr[0].setText(LocaleController.getString(R.string.TelegramPremium));
                    org.telegram.ui.b.n(R.string.TelegramPremiumSubscribedSubtitle, this.M0);
                } else {
                    f90 f90Var = f90VarArr[0];
                    String formatString2 = LocaleController.formatString(R.string.TelegramPremiumUserDialogTitle, ContactsController.formatName(user.first_name, user.last_name));
                    Integer num2 = this.r0;
                    f90Var.setText(AndroidUtilities.replaceSingleLink(formatString2, num2 == null ? getThemedColor(j6.u6) : num2.intValue()));
                    org.telegram.ui.b.n(R.string.TelegramPremiumUserDialogSubtitle, this.M0);
                }
            } else if (this.Z) {
                f90 f90Var2 = f90VarArr[0];
                String formatString3 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumOutboundDialogTitleWithPlural, user != null ? user.first_name : "", LocaleController.formatPluralString("GiftMonths", nVar.d(), new Object[0]));
                Integer num3 = this.r0;
                f90Var2.setText(AndroidUtilities.replaceSingleLink(formatString3, num3 == null ? getThemedColor(j6.u6) : num3.intValue()));
                f90 f90Var3 = this.M0;
                String formatString4 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumOutboundDialogSubtitle, user != null ? user.first_name : "");
                Integer num4 = this.r0;
                f90Var3.setText(AndroidUtilities.replaceSingleLink(formatString4, num4 == null ? getThemedColor(j6.u6) : num4.intValue()));
            } else if (user == null || TextUtils.isEmpty(user.first_name) || user.id == 777000) {
                f90 f90Var4 = this.L0[0];
                String formatString5 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumDialogTitleWithPluralSomeone, LocaleController.formatPluralString("GiftMonths", nVar.d(), new Object[0]));
                Integer num5 = this.r0;
                f90Var4.setText(AndroidUtilities.replaceSingleLink(formatString5, num5 == null ? getThemedColor(j6.u6) : num5.intValue()));
                org.telegram.ui.b.n(R.string.TelegramPremiumUserGiftedPremiumDialogSubtitle, this.M0);
            } else {
                f90 f90Var5 = this.L0[0];
                String formatString6 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumDialogTitleWithPlural, user.first_name, LocaleController.formatPluralString("GiftMonths", nVar.d(), new Object[0]));
                Integer num6 = this.r0;
                f90Var5.setText(AndroidUtilities.replaceSingleLink(formatString6, num6 == null ? getThemedColor(j6.u6) : num6.intValue()));
                org.telegram.ui.b.n(R.string.TelegramPremiumUserGiftedPremiumDialogSubtitle, this.M0);
            }
        }
        try {
            f90 f90Var6 = this.L0[0];
            f90Var6.setText(Emoji.replaceEmoji(f90Var6.getText(), this.L0[0].getPaint().getFontMetricsInt(), false));
        } catch (Exception unused2) {
        }
    }

    public void b0() {
        int i10 = this.c0;
        int i11 = i10 + 1;
        this.c0 = i11;
        this.d0 = i10;
        this.g0 = i11;
        int size = this.U.size() + i11;
        this.h0 = size;
        this.c0 = size + 1;
        this.i0 = size;
        if (UserConfig.getInstance(this.V).isPremium() || this.X != null) {
            return;
        }
        int i12 = this.c0;
        this.c0 = i12 + 1;
        this.j0 = i12;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.InputStickerSet inputStickerSet;
        if (i10 == NotificationCenter.groupStickersDidLoad && (inputStickerSet = this.z0) != null && inputStickerSet.id == ((Long) objArr[0]).longValue()) {
            a0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        ValueAnimator valueAnimator = this.F0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        s00 s00Var = this.l0;
        if (s00Var.c) {
            s00Var.animate().alpha(0.0f).setDuration(150L).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void mainContainerDispatchDraw(Canvas canvas) {
        View view = this.y0;
        if (view != null) {
            view.setVisibility(this.E0 ? 4 : 0);
        }
        super.mainContainerDispatchDraw(canvas);
        if (this.x0 == null || !this.E0) {
            return;
        }
        View view2 = this.y0;
        View view3 = view2 == null ? this.o0 : view2;
        if (view3 == view2) {
            view2.setVisibility(0);
        }
        canvas.save();
        float[] fArr = {this.s0, this.t0};
        this.x0.getMatrix().mapPoints(fArr);
        View view4 = this.x0;
        Drawable rightDrawable = view4 instanceof k5 ? ((k5) view4).getRightDrawable() : view4 instanceof org.telegram.ui.Cells.s1 ? ((org.telegram.ui.Cells.s1) view4).cc : null;
        if (rightDrawable == null) {
            canvas.restore();
            return;
        }
        int[] iArr = this.C0;
        float f10 = (-iArr[0]) + this.u0 + fArr[0];
        float f11 = (-iArr[1]) + this.v0 + fArr[1];
        if (AndroidUtilities.isTablet()) {
            ViewGroup view5 = this.q0.getParentLayout().getView();
            f10 += view5.getX() + view5.getPaddingLeft();
            f11 += view5.getY() + view5.getPaddingTop();
        }
        float intrinsicWidth = this.w0 * rightDrawable.getIntrinsicWidth();
        float measuredHeight = view3.getMeasuredHeight() * 0.8f;
        float f12 = measuredHeight / intrinsicWidth;
        float f13 = intrinsicWidth / measuredHeight;
        float measuredWidth = view3.getMeasuredWidth() / 2.0f;
        for (View view6 = view3; view6 != this.container && view6 != null; view6 = (View) view6.getParent()) {
            measuredWidth += view6.getX();
        }
        float measuredHeight2 = (view3.getMeasuredHeight() / 2.0f) + ((View) view3.getParent().getParent()).getY() + ((View) view3.getParent()).getY() + view3.getY() + 0.0f;
        float lerp = AndroidUtilities.lerp(f10, measuredWidth, mr.h.getInterpolation(this.D0));
        float lerp2 = AndroidUtilities.lerp(f11, measuredHeight2, this.D0);
        float f14 = this.w0;
        float f15 = this.D0;
        float f16 = (f12 * f15) + ((1.0f - f15) * f14);
        canvas.save();
        canvas.scale(f16, f16, lerp, lerp2);
        int i10 = (int) lerp;
        int i11 = (int) lerp2;
        rightDrawable.setBounds(org.telegram.ui.b.u(2, i10, rightDrawable), org.telegram.ui.b.f(2, i11, rightDrawable), org.telegram.ui.b.A(2, i10, rightDrawable), org.telegram.ui.b.y(2, i11, rightDrawable));
        rightDrawable.setAlpha((int) ((1.0f - Utilities.clamp(this.D0, 1.0f, 0.0f)) * 255.0f));
        rightDrawable.draw(canvas);
        rightDrawable.setAlpha(0);
        canvas.restore();
        float lerp3 = AndroidUtilities.lerp(f13, 1.0f, this.D0);
        canvas.scale(lerp3, lerp3, lerp, lerp2);
        canvas.translate(lerp - (view3.getMeasuredWidth() / 2.0f), lerp2 - (view3.getMeasuredHeight() / 2.0f));
        view3.draw(canvas);
        canvas.restore();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).addObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean onCustomOpenAnimation() {
        Drawable drawable;
        int i10 = 0;
        if (this.x0 == null) {
            return false;
        }
        int i11 = 2;
        this.F0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.D0 = 0.0f;
        this.E0 = true;
        this.p0.invalidate();
        View view = this.x0;
        if (view instanceof k5) {
            drawable = ((k5) view).getRightDrawable();
        } else if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            j5 j5Var = s1Var.cc;
            s1Var.a3();
            drawable = j5Var;
        } else {
            drawable = null;
        }
        if (drawable != null) {
            drawable.setAlpha(0);
        }
        View view2 = this.x0;
        if (view2 instanceof org.telegram.ui.Cells.s1) {
            ((org.telegram.ui.Cells.s1) view2).a3();
        } else {
            view2.invalidate();
        }
        i iVar = this.o0;
        if (iVar != null) {
            iVar.j(100L);
        }
        this.F0.addUpdateListener(new x1(this, i10));
        this.F0.addListener(new y2(i11, this, drawable));
        this.F0.setDuration(600L);
        this.F0.setInterpolator(mr.h);
        this.F0.start();
        return super.onCustomOpenAnimation();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override // org.telegram.ui.ActionBar.g3, android.app.Dialog
    public final void show() {
        super.show();
        int i10 = 1;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
        if (this.G0) {
            AndroidUtilities.runOnUIThread(new u1(this, i10), 200L);
        }
    }

    @Override // org.telegram.ui.ActionBar.g3, org.telegram.ui.ActionBar.l2
    public final boolean showDialog(Dialog dialog) {
        i iVar = this.o0;
        if (iVar != null) {
            iVar.setDialogVisible(true);
        }
        this.n0.setPaused(true);
        dialog.setOnDismissListener(new d0(this, 1));
        dialog.show();
        return true;
    }

    @Override // org.telegram.ui.Components.sa
    public final ql0 v(rl0 rl0Var) {
        return new d2(this);
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(R.string.TelegramPremium);
    }

    public e2(org.telegram.ui.ActionBar.p2 p2Var, int i10, TLRPC.User user, n nVar, TL_stars.StarGift starGift, f6 f6Var) {
        super(p2Var, false, false, f6Var);
        ArrayList arrayList = new ArrayList();
        this.U = arrayList;
        this.C0 = new int[2];
        this.D0 = 0.0f;
        fixNavigationBar();
        this.q0 = p2Var;
        this.v = 0.26f;
        this.W = user;
        this.V = i10;
        this.X = nVar;
        this.Y = starGift;
        this.a0 = new gw0(getContext(), null);
        PremiumPreviewFragment.n0(i10, arrayList);
        if (nVar != null || UserConfig.getInstance(i10).isPremium()) {
            this.I0.setVisibility(8);
        }
        q1 q1Var = new q1(j6.Lj, j6.Mj, j6.Nj, j6.Oj, null);
        this.m0 = q1Var;
        q1Var.m = true;
        q1Var.o = 1.0f;
        q1Var.p = 0.0f;
        q1Var.q = 0.0f;
        q1Var.b = 0.0f;
        q1Var.c = 0.0f;
        b0();
        this.d.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        this.d.setOnItemClickListener(new w1(this, i10, p2Var, 0));
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        PremiumPreviewFragment.r0("profile");
        s00 s00Var = new s00(getContext());
        this.l0 = s00Var;
        this.container.addView(s00Var, b6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.J0 = frameLayout;
        this.containerView.addView(frameLayout, b6.e(-1, 140, 87));
    }

    public void Y(View view) {
    }

    public void V(int i10, View view) {
    }
}
