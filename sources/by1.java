// default package

import android.app.Activity;
import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class by1 extends xz1 {
    public final /* synthetic */ byte y0 = 0;
    public final /* synthetic */ ChatActivityEnterView z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by1(ChatActivityEnterView chatActivityEnterView, Context context, ylb ylbVar) {
        super(R.drawable.input_done, ylbVar, context, true);
        this.z0 = chatActivityEnterView;
    }

    @Override // xz1
    public final boolean b() {
        switch (this.y0) {
            case 0:
                return this.z0.c();
            default:
                return super.b();
        }
    }

    @Override // xz1
    public final boolean c() {
        byte b = this.y0;
        ChatActivityEnterView chatActivityEnterView = this.z0;
        switch (b) {
            case 0:
                return !chatActivityEnterView.c() && chatActivityEnterView.H0 == Integer.MAX_VALUE;
            default:
                return !chatActivityEnterView.g4;
        }
    }

    @Override // xz1
    public final boolean d() {
        switch (this.y0) {
            case 0:
                j67 j67Var = this.z0.M0;
                if ((j67Var == null || j67Var.u0) && this.w <= 0) {
                }
                break;
        }
        return true;
    }

    @Override // xz1
    public final boolean j() {
        switch (this.y0) {
            case 0:
                return this.z0.X5;
            default:
                return super.j();
        }
    }

    @Override // android.view.View
    public final void setAlpha(float f) {
        switch (this.y0) {
            case 0:
                super.setAlpha(f);
                int i = ChatActivityEnterView.z7;
                this.z0.k2();
                break;
            default:
                super.setAlpha(f);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by1(ChatActivityEnterView chatActivityEnterView, Activity activity, int i, ylb ylbVar) {
        super(i, ylbVar, activity, true);
        this.z0 = chatActivityEnterView;
    }
}
