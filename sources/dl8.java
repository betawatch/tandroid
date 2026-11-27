// default package

import android.content.DialogInterface;
import android.graphics.RectF;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.r;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ShareActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class dl8 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dl8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        b29 b29Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                kl8 kl8Var = (kl8) obj;
                i94 i94Var = kl8Var.m2;
                if (i94Var != null) {
                    i94Var.setDialogVisible(false);
                }
                kl8Var.l2.setPaused(false);
                break;
            case 1:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                boolean g = privacyControlActivity.u0.g();
                b29 b29Var2 = privacyControlActivity.v0;
                if (!g) {
                    b29Var2.K(86);
                    privacyControlActivity.w0.e.d();
                    break;
                } else {
                    b29Var2.I(0, false, false);
                    break;
                }
            case 2:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.Z6;
                boolean g2 = profileActivity.r0.g();
                b29 b29Var3 = profileActivity.V;
                if (!g2) {
                    b29Var3.K(86);
                    profileActivity.W.K(86);
                    ap8 ap8Var = profileActivity.a0;
                    if (ap8Var != null) {
                        xo8 i = ap8.i(14, ap8Var.a);
                        if (i != null && (b29Var = i.k) != null) {
                            b29Var.start();
                        }
                    } else {
                        profileActivity.s.d();
                    }
                    skb skbVar = profileActivity.N2;
                    if (skbVar != null) {
                        skbVar.getImageView().d();
                        break;
                    }
                } else {
                    b29Var3.I(0, false, false);
                    profileActivity.W.I(0, false, false);
                    break;
                }
                break;
            case 3:
                hl.t1((f42) obj);
                break;
            case 4:
                ((yg9) obj).P0 = null;
                break;
            case 5:
                hl.t1((iw9) obj);
                break;
            case 6:
                ((n1a) obj).w(0.0f);
                break;
            case 7:
                ShareActivity shareActivity = (ShareActivity) obj;
                int i2 = ShareActivity.b;
                if (!shareActivity.isFinishing()) {
                    shareActivity.finish();
                }
                shareActivity.a = null;
                break;
            case 8:
                ((ida) obj).run();
                break;
            case 9:
                ((db9) obj).run();
                break;
            case 10:
                lcb lcbVar = (lcb) obj;
                if (dialogInterface == lcbVar.v0) {
                    lcbVar.v0 = null;
                    lcbVar.U();
                    break;
                }
                break;
            case 11:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.r = null;
                themeActivity.h = null;
                themeActivity.n = null;
                break;
            case 12:
                ThemeEditorView themeEditorView = ((r) obj).d;
                themeEditorView.n = null;
                if (themeEditorView.d != null) {
                    hl.s3(themeEditorView.j, themeEditorView.c, themeEditorView.i);
                    try {
                        themeEditorView.j.addView(themeEditorView.c, themeEditorView.i);
                        themeEditorView.e();
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 13:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                twoStepVerificationActivity.getNotificationCenter().k(54, new Object[0]);
                twoStepVerificationActivity.finishFragment();
                break;
            case 14:
                ((mkc) obj).u0.b();
                break;
            case 15:
                azb azbVar = (azb) obj;
                if (azbVar != null) {
                    azbVar.run();
                    break;
                }
                break;
            case 16:
                TLRPC.User user = (TLRPC.User) obj;
                e S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(new euc(user));
                    break;
                }
                break;
            default:
                euc eucVar = (euc) obj;
                EditTextBoldCursor editTextBoldCursor = eucVar.I;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    hl.E3(eucVar.I);
                    break;
                }
                break;
        }
    }
}
