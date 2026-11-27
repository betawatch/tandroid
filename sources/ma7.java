// default package

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class ma7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ ma7(uc7 uc7Var, TLRPC.TL_error tL_error, e eVar, TLRPC.TL_channels_editAdmin tL_channels_editAdmin, boolean z, boolean z2) {
        this.a = (byte) 0;
        this.e = uc7Var;
        this.f = tL_error;
        this.d = eVar;
        this.h = tL_channels_editAdmin;
        this.b = z;
        this.c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        boolean z2 = this.b;
        Object obj = this.h;
        Object obj2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (b) {
            case 0:
                jj.c0(((uc7) obj4).currentAccount, (TLRPC.TL_error) obj3, (e) obj2, (TLRPC.TL_channels_editAdmin) obj, Boolean.valueOf(z2), Boolean.valueOf(z));
                break;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj4;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj3;
                e eVar = (e) obj2;
                e eVar2 = (e) obj;
                Drawable drawable = ActionBarLayout.w1;
                if (z2) {
                    actionBarLayout.h = true;
                    actionBarLayout.K = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    actionBarLayout.b0 = false;
                    actionBarLayout.s.setScaleX(1.0f);
                    actionBarLayout.s.setScaleY(1.0f);
                } else {
                    actionBarLayout.V(eVar, z);
                    actionBarLayout.s.setTranslationX(0.0f);
                }
                if (eVar != null) {
                    eVar.onTransitionAnimationEnd(false, false);
                }
                eVar2.onTransitionAnimationEnd(true, false);
                eVar2.onBecomeFullyVisible();
                break;
            case 2:
                ((ip7) obj4).D((ArrayList) obj3, (ArrayList) obj2, this.b, this.c, (CountDownLatch) obj);
                break;
            default:
                ((TwoStepVerificationActivity) obj4).k0((TLRPC.TL_error) obj3, (TLObject) obj2, this.b, this.c, (Runnable) obj);
                break;
        }
    }

    public /* synthetic */ ma7(fn7 fn7Var, Object obj, Object obj2, boolean z, boolean z2, Object obj3, byte b) {
        this.a = b;
        this.e = fn7Var;
        this.f = obj;
        this.d = obj2;
        this.b = z;
        this.c = z2;
        this.h = obj3;
    }

    public /* synthetic */ ma7(ActionBarLayout actionBarLayout, boolean z, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, boolean z2, e eVar, e eVar2) {
        this.a = (byte) 1;
        this.e = actionBarLayout;
        this.b = z;
        this.f = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.c = z2;
        this.d = eVar;
        this.h = eVar2;
    }
}
