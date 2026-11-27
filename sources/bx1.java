// default package

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class bx1 extends bz1 {
    public final /* synthetic */ ChatActivityEnterView A0;
    public final /* synthetic */ byte z0 = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx1(ChatActivityEnterView chatActivityEnterView, Context context, vnb vnbVar) {
        super(R.drawable.input_done, vnbVar, context, true);
        this.A0 = chatActivityEnterView;
    }

    @Override // bz1
    public final boolean b() {
        switch (this.z0) {
            case 0:
                return this.A0.c();
            default:
                return super.b();
        }
    }

    @Override // bz1
    public final boolean c() {
        byte b = this.z0;
        ChatActivityEnterView chatActivityEnterView = this.A0;
        switch (b) {
            case 0:
                return !chatActivityEnterView.c() && chatActivityEnterView.H0 == Integer.MAX_VALUE;
            default:
                return !chatActivityEnterView.f4;
        }
    }

    @Override // bz1
    public final boolean d() {
        switch (this.z0) {
            case 0:
                q67 q67Var = this.A0.M0;
                if ((q67Var == null || q67Var.u0) && this.w <= 0) {
                }
                break;
        }
        return true;
    }

    @Override // bz1
    public final boolean j() {
        switch (this.z0) {
            case 0:
                return this.A0.i6;
            default:
                return super.j();
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        switch (this.z0) {
            case 0:
                super.setAlpha(f);
                int i = ChatActivityEnterView.X7;
                this.A0.r2();
                break;
            default:
                super.setAlpha(f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx1(ChatActivityEnterView chatActivityEnterView, Activity activity, int i, vnb vnbVar) {
        super(i, vnbVar, activity, true);
        this.A0 = chatActivityEnterView;
    }
}
