package cg;

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
import bg.c3;
import i7.f6;
import java.util.ArrayList;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.n5;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.y80;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.fw0;
import org.telegram.ui.qv0;
import org.telegram.ui.ua1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class f2 extends xa implements NotificationCenter.NotificationCenterDelegate {
    public boolean A0;
    public final int[] B0;
    public float C0;
    public boolean D0;
    public ValueAnimator E0;
    public boolean F0;
    public boolean G0;
    public FrameLayout H0;
    public final FrameLayout I0;
    public FrameLayout J0;
    public y80[] K0;
    public y80 L0;
    public final ArrayList T;
    public int U;
    public final TLRPC.User V;
    public final n W;
    public final TL_stars.StarGift X;
    public boolean Y;
    public final qv0 Z;
    public int a0;
    public int b0;
    public int c0;
    public int d0;
    public int e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public final n00 k0;
    public final r1 l0;
    public h m0;
    public i n0;
    public ua1 o0;
    public final org.telegram.ui.ActionBar.o2 p0;
    public Integer q0;
    public float r0;
    public float s0;
    public float t0;
    public float u0;
    public float v0;
    public View w0;
    public View x0;
    public TLRPC.InputStickerSet y0;
    public TLRPC.TL_emojiStatusCollectible z0;

    public f2(org.telegram.ui.ActionBar.o2 o2Var, int i10, TLRPC.User user, c6 c6Var) {
        this(o2Var, i10, user, null, null, c6Var);
    }

    public static /* synthetic */ void P(f2 f2Var) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(f2Var.y0);
        z1 z1Var = new z1(f2Var, 0);
        org.telegram.ui.ActionBar.o2 o2Var = f2Var.p0;
        if (o2Var != null) {
            z1Var.setParentFragment(o2Var);
        }
        new a2(f2Var, z1Var, f2Var.getContext(), f2Var.resourcesProvider, arrayList).show();
    }

    @Override // org.telegram.ui.Components.xa
    public final void D(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int i12 = 0;
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.T;
            if (i12 >= arrayList.size()) {
                this.a0 = i13;
                this.container.getLocationOnScreen(this.B0);
                return;
            }
            fw0 fw0Var = (fw0) arrayList.get(i12);
            qv0 qv0Var = this.Z;
            qv0Var.a(fw0Var, false);
            qv0Var.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_31));
            ((fw0) arrayList.get(i12)).e = i13;
            i13 += qv0Var.getMeasuredHeight();
            i12++;
        }
    }

    @Override // org.telegram.ui.Components.xa
    public final void F(hv0 hv0Var) {
        this.U = UserConfig.selectedAccount;
        d1 d1Var = new d1(getContext(), this.resourcesProvider, false);
        d1Var.a(PremiumPreviewFragment.o0(this.U, null), new ag.o(this, 6), false);
        this.H0 = new FrameLayout(getContext());
        View view = new View(getContext());
        view.setBackgroundColor(getThemedColor(g6.d7));
        this.H0.addView(view, f6.c(1.0f, -1));
        view.getLayoutParams().height = 1;
        AndroidUtilities.updateViewVisibilityAnimated(view, true, 1.0f, false);
        if (UserConfig.getInstance(this.U).isPremium() || (this instanceof eg.n1)) {
            return;
        }
        this.H0.addView(d1Var, f6.d(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
        this.H0.setBackgroundColor(getThemedColor(g6.h5));
        hv0Var.addView(this.H0, f6.e(-1, 68, 80));
    }

    public void W(ua1 ua1Var) {
        ua1Var.addView(this.x0, f6.p(140, 140, 1.0f, 17, 10, 10, 10, 10));
    }

    public int X() {
        return 0;
    }

    public View Z(Context context, int i10) {
        return null;
    }

    public void a0(boolean z10) {
        TLRPC.Document document;
        SpannableStringBuilder spannableStringBuilder;
        y80[] y80VarArr = this.K0;
        if (y80VarArr == null || this.L0 == null) {
            return;
        }
        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = this.z0;
        int i10 = 2;
        int i11 = 1;
        TLRPC.User user = this.V;
        int i12 = 0;
        if (tL_emojiStatusCollectible != null) {
            String str = tL_emojiStatusCollectible.title;
            int lastIndexOf = str.lastIndexOf(32);
            if (lastIndexOf >= 0) {
                str = str.substring(0, lastIndexOf);
            }
            this.K0[0].setText(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TelegramPremiumUserStatusCollectibleDialogTitle, DialogObject.getShortName(user), str), new v1(this, i12)));
            org.telegram.ui.b.o(R.string.TelegramPremiumUserStatusDialogSubtitle, this.L0);
        } else if (this.y0 != null) {
            String formatString = LocaleController.formatString(R.string.TelegramPremiumUserStatusDialogTitle, ContactsController.formatName(user.first_name, user.last_name), "<STICKERSET>");
            Integer num = this.q0;
            CharSequence replaceSingleLink = AndroidUtilities.replaceSingleLink(formatString, num == null ? getThemedColor(g6.u6) : num.intValue());
            try {
                replaceSingleLink = Emoji.replaceEmoji(replaceSingleLink, this.K0[0].getPaint().getFontMetricsInt(), false);
            } catch (Exception unused) {
            }
            SpannableStringBuilder spannableStringBuilder2 = replaceSingleLink instanceof SpannableStringBuilder ? (SpannableStringBuilder) replaceSingleLink : new SpannableStringBuilder(replaceSingleLink);
            int indexOf = replaceSingleLink.toString().indexOf("<STICKERSET>");
            if (indexOf >= 0) {
                TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(this.U).getStickerSet(this.y0, false);
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
                    spannableStringBuilder.setSpan(new y5(document, this.K0[0].getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                    if (stickerSet != null && stickerSet.set != null) {
                        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) stickerSet.set.title);
                    }
                } else {
                    spannableStringBuilder = new SpannableStringBuilder("xxxxxx");
                    spannableStringBuilder.setSpan(new d90(AndroidUtilities.dp(100.0f), this.K0[0]), 0, spannableStringBuilder.length(), 33);
                }
                spannableStringBuilder2.replace(indexOf, indexOf + 12, (CharSequence) spannableStringBuilder);
                spannableStringBuilder2.setSpan(new l0(this, i11), indexOf, spannableStringBuilder.length() + indexOf, 33);
                this.K0[1].setOnLinkPressListener(new x80() { // from class: cg.w1
                    @Override // org.telegram.ui.Components.x80
                    public final void a(ClickableSpan clickableSpan) {
                        f2.P(f2.this);
                    }
                });
                if (document != null) {
                    y80[] y80VarArr2 = this.K0;
                    if (y80VarArr2 != null) {
                        y80VarArr2[1].setText(spannableStringBuilder2);
                        if (this.K0[1].getVisibility() != 0) {
                            if (z10) {
                                this.K0[1].setAlpha(0.0f);
                                this.K0[1].setVisibility(0);
                                ViewPropertyAnimator alpha = this.K0[1].animate().alpha(1.0f);
                                jr jrVar = jr.f;
                                org.telegram.ui.b.q(alpha, jrVar, 200L);
                                this.K0[0].animate().alpha(0.0f).setInterpolator(jrVar).setDuration(200L).withEndAction(new v1(this, i10)).start();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new y1(this, i11));
                                ofFloat.setInterpolator(jrVar);
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                            } else {
                                this.K0[1].setAlpha(1.0f);
                                this.K0[1].setVisibility(0);
                                this.K0[0].setAlpha(0.0f);
                                this.K0[0].setVisibility(8);
                            }
                        }
                    }
                } else {
                    this.K0[0].setText(spannableStringBuilder2, (TextView.BufferType) null);
                }
            }
            org.telegram.ui.b.o(R.string.TelegramPremiumUserStatusDialogSubtitle, this.L0);
        } else if (this.A0) {
            y80VarArr[0].setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.TelegramPremiumUserStatusDefaultDialogTitle, ContactsController.formatName(user.first_name, user.last_name))));
            this.L0.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.TelegramPremiumUserStatusDialogSubtitle, ContactsController.formatName(user.first_name, user.last_name))));
        } else {
            n nVar = this.W;
            if (nVar == null) {
                TL_stars.StarGift starGift = this.X;
                if (starGift != null) {
                    y80VarArr[0].setText(LocaleController.getString(R.string.Gift2PremiumTitle));
                    this.K0[0].setTextSize(1, 20.0f);
                    if (starGift.limited_per_user) {
                        this.L0.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PremiumSubtitleMany", starGift.per_user_total)));
                    } else {
                        org.telegram.ui.b.o(R.string.Gift2PremiumSubtitle, this.L0);
                    }
                    this.L0.setTextSize(1, 14.0f);
                } else if (user == null) {
                    y80VarArr[0].setText(LocaleController.getString(R.string.TelegramPremium));
                    org.telegram.ui.b.o(R.string.TelegramPremiumSubscribedSubtitle, this.L0);
                } else {
                    y80 y80Var = y80VarArr[0];
                    String formatString2 = LocaleController.formatString(R.string.TelegramPremiumUserDialogTitle, ContactsController.formatName(user.first_name, user.last_name));
                    Integer num2 = this.q0;
                    y80Var.setText(AndroidUtilities.replaceSingleLink(formatString2, num2 == null ? getThemedColor(g6.u6) : num2.intValue()));
                    org.telegram.ui.b.o(R.string.TelegramPremiumUserDialogSubtitle, this.L0);
                }
            } else if (this.Y) {
                y80 y80Var2 = y80VarArr[0];
                String formatString3 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumOutboundDialogTitleWithPlural, user != null ? user.first_name : "", LocaleController.formatPluralString("GiftMonths", nVar.d(), new Object[0]));
                Integer num3 = this.q0;
                y80Var2.setText(AndroidUtilities.replaceSingleLink(formatString3, num3 == null ? getThemedColor(g6.u6) : num3.intValue()));
                y80 y80Var3 = this.L0;
                String formatString4 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumOutboundDialogSubtitle, user != null ? user.first_name : "");
                Integer num4 = this.q0;
                y80Var3.setText(AndroidUtilities.replaceSingleLink(formatString4, num4 == null ? getThemedColor(g6.u6) : num4.intValue()));
            } else if (user == null || TextUtils.isEmpty(user.first_name) || user.id == 777000) {
                y80 y80Var4 = this.K0[0];
                String formatString5 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumDialogTitleWithPluralSomeone, LocaleController.formatPluralString("GiftMonths", nVar.d(), new Object[0]));
                Integer num5 = this.q0;
                y80Var4.setText(AndroidUtilities.replaceSingleLink(formatString5, num5 == null ? getThemedColor(g6.u6) : num5.intValue()));
                org.telegram.ui.b.o(R.string.TelegramPremiumUserGiftedPremiumDialogSubtitle, this.L0);
            } else {
                y80 y80Var5 = this.K0[0];
                String formatString6 = LocaleController.formatString(R.string.TelegramPremiumUserGiftedPremiumDialogTitleWithPlural, user.first_name, LocaleController.formatPluralString("GiftMonths", nVar.d(), new Object[0]));
                Integer num6 = this.q0;
                y80Var5.setText(AndroidUtilities.replaceSingleLink(formatString6, num6 == null ? getThemedColor(g6.u6) : num6.intValue()));
                org.telegram.ui.b.o(R.string.TelegramPremiumUserGiftedPremiumDialogSubtitle, this.L0);
            }
        }
        try {
            y80 y80Var6 = this.K0[0];
            y80Var6.setText(Emoji.replaceEmoji(y80Var6.getText(), this.K0[0].getPaint().getFontMetricsInt(), false));
        } catch (Exception unused2) {
        }
    }

    public void b0() {
        int i10 = this.b0;
        int i11 = i10 + 1;
        this.b0 = i11;
        this.c0 = i10;
        this.f0 = i11;
        int size = this.T.size() + i11;
        this.g0 = size;
        this.b0 = size + 1;
        this.h0 = size;
        if (UserConfig.getInstance(this.U).isPremium() || this.W != null) {
            return;
        }
        int i12 = this.b0;
        this.b0 = i12 + 1;
        this.i0 = i12;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.InputStickerSet inputStickerSet;
        if (i10 == NotificationCenter.groupStickersDidLoad && (inputStickerSet = this.y0) != null && inputStickerSet.id == ((Long) objArr[0]).longValue()) {
            a0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
        ValueAnimator valueAnimator = this.E0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        n00 n00Var = this.k0;
        if (n00Var.c) {
            n00Var.animate().alpha(0.0f).setDuration(150L).start();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void mainContainerDispatchDraw(Canvas canvas) {
        View view = this.x0;
        if (view != null) {
            view.setVisibility(this.D0 ? 4 : 0);
        }
        super.mainContainerDispatchDraw(canvas);
        if (this.w0 == null || !this.D0) {
            return;
        }
        View view2 = this.x0;
        View view3 = view2 == null ? this.n0 : view2;
        if (view3 == view2) {
            view2.setVisibility(0);
        }
        canvas.save();
        float[] fArr = {this.r0, this.s0};
        this.w0.getMatrix().mapPoints(fArr);
        View view4 = this.w0;
        Drawable rightDrawable = view4 instanceof h5 ? ((h5) view4).getRightDrawable() : view4 instanceof org.telegram.ui.Cells.s1 ? ((org.telegram.ui.Cells.s1) view4).bc : null;
        if (rightDrawable == null) {
            canvas.restore();
            return;
        }
        int[] iArr = this.B0;
        float f9 = (-iArr[0]) + this.t0 + fArr[0];
        float f10 = (-iArr[1]) + this.u0 + fArr[1];
        if (AndroidUtilities.isTablet()) {
            ViewGroup view5 = this.p0.getParentLayout().getView();
            f9 += view5.getX() + view5.getPaddingLeft();
            f10 += view5.getY() + view5.getPaddingTop();
        }
        float intrinsicWidth = this.v0 * rightDrawable.getIntrinsicWidth();
        float measuredHeight = view3.getMeasuredHeight() * 0.8f;
        float f11 = measuredHeight / intrinsicWidth;
        float f12 = intrinsicWidth / measuredHeight;
        float measuredWidth = view3.getMeasuredWidth() / 2.0f;
        for (View view6 = view3; view6 != this.container && view6 != null; view6 = (View) view6.getParent()) {
            measuredWidth += view6.getX();
        }
        float measuredHeight2 = (view3.getMeasuredHeight() / 2.0f) + ((View) view3.getParent().getParent()).getY() + ((View) view3.getParent()).getY() + view3.getY() + 0.0f;
        float lerp = AndroidUtilities.lerp(f9, measuredWidth, jr.h.getInterpolation(this.C0));
        float lerp2 = AndroidUtilities.lerp(f10, measuredHeight2, this.C0);
        float f13 = this.v0;
        float f14 = this.C0;
        float f15 = (f11 * f14) + ((1.0f - f14) * f13);
        canvas.save();
        canvas.scale(f15, f15, lerp, lerp2);
        int i10 = (int) lerp;
        int i11 = (int) lerp2;
        rightDrawable.setBounds(org.telegram.ui.b.v(2, i10, rightDrawable), org.telegram.ui.b.f(2, i11, rightDrawable), org.telegram.ui.b.A(2, i10, rightDrawable), org.telegram.ui.b.y(2, i11, rightDrawable));
        rightDrawable.setAlpha((int) ((1.0f - Utilities.clamp(this.C0, 1.0f, 0.0f)) * 255.0f));
        rightDrawable.draw(canvas);
        rightDrawable.setAlpha(0);
        canvas.restore();
        float lerp3 = AndroidUtilities.lerp(f12, 1.0f, this.C0);
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

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean onCustomOpenAnimation() {
        Drawable drawable;
        int i10 = 0;
        if (this.w0 == null) {
            return false;
        }
        int i11 = 2;
        this.E0 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.C0 = 0.0f;
        this.D0 = true;
        this.o0.invalidate();
        View view = this.w0;
        if (view instanceof h5) {
            drawable = ((h5) view).getRightDrawable();
        } else if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            n5 n5Var = s1Var.bc;
            s1Var.a3();
            drawable = n5Var;
        } else {
            drawable = null;
        }
        if (drawable != null) {
            drawable.setAlpha(0);
        }
        View view2 = this.w0;
        if (view2 instanceof org.telegram.ui.Cells.s1) {
            ((org.telegram.ui.Cells.s1) view2).a3();
        } else {
            view2.invalidate();
        }
        i iVar = this.n0;
        if (iVar != null) {
            iVar.j(100L);
        }
        this.E0.addUpdateListener(new y1(this, i10));
        this.E0.addListener(new c3(i11, this, drawable));
        this.E0.setDuration(600L);
        this.E0.setInterpolator(jr.h);
        this.E0.start();
        return super.onCustomOpenAnimation();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(UserConfig.selectedAccount).removeObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        super.show();
        int i10 = 1;
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
        if (this.F0) {
            AndroidUtilities.runOnUIThread(new v1(this, i10), 200L);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, org.telegram.ui.ActionBar.k2
    public final boolean showDialog(Dialog dialog) {
        i iVar = this.n0;
        if (iVar != null) {
            iVar.setDialogVisible(true);
        }
        this.m0.setPaused(true);
        dialog.setOnDismissListener(new d0(this, 1));
        dialog.show();
        return true;
    }

    @Override // org.telegram.ui.Components.xa
    public final il0 v(jl0 jl0Var) {
        return new e2(this);
    }

    @Override // org.telegram.ui.Components.xa
    public final CharSequence y() {
        return LocaleController.getString(R.string.TelegramPremium);
    }

    public f2(org.telegram.ui.ActionBar.o2 o2Var, int i10, TLRPC.User user, n nVar, TL_stars.StarGift starGift, c6 c6Var) {
        super(o2Var, false, false, c6Var);
        ArrayList arrayList = new ArrayList();
        this.T = arrayList;
        this.B0 = new int[2];
        this.C0 = 0.0f;
        fixNavigationBar();
        this.p0 = o2Var;
        this.v = 0.26f;
        this.V = user;
        this.U = i10;
        this.W = nVar;
        this.X = starGift;
        this.Z = new qv0(getContext(), null);
        PremiumPreviewFragment.n0(i10, arrayList);
        if (nVar != null || UserConfig.getInstance(i10).isPremium()) {
            this.H0.setVisibility(8);
        }
        r1 r1Var = new r1(g6.Lj, g6.Mj, g6.Nj, g6.Oj, null);
        this.l0 = r1Var;
        r1Var.m = true;
        r1Var.o = 1.0f;
        r1Var.p = 0.0f;
        r1Var.q = 0.0f;
        r1Var.b = 0.0f;
        r1Var.c = 0.0f;
        b0();
        this.d.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
        this.d.setOnItemClickListener(new x1(this, i10, o2Var, 0));
        MediaDataController.getInstance(i10).preloadPremiumPreviewStickers();
        PremiumPreviewFragment.r0("profile");
        n00 n00Var = new n00(getContext());
        this.k0 = n00Var;
        this.container.addView(n00Var, f6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.I0 = frameLayout;
        this.containerView.addView(frameLayout, f6.e(-1, 140, 87));
    }

    public void Y(View view) {
    }

    public void V(int i10, View view) {
    }
}
