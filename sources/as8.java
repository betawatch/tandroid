// default package

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class as8 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    public /* synthetic */ as8(FrameLayout frameLayout, boolean z, int i, byte b) {
        this.a = b;
        this.d = frameLayout;
        this.b = z;
        this.c = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        boolean z = this.b;
        FrameLayout frameLayout = this.d;
        switch (b) {
            case 0:
                lea leaVar = (lea) frameLayout;
                if (leaVar.e.h() && leaVar.h.getCurrentPosition() != 0) {
                    leaVar.a();
                    break;
                } else {
                    int i = this.c;
                    if (!z) {
                        yw4.f1(false, ok0.a(i).b());
                        break;
                    } else {
                        ux4 ux4Var = new ux4(leaVar.getContext(), i, leaVar.c, null, null);
                        ux4Var.a1(ok0.a(i).c(leaVar.c));
                        ux4Var.show();
                        break;
                    }
                }
                break;
            default:
                nha nhaVar = (nha) frameLayout;
                d dVar = nhaVar.y1;
                if (!z) {
                    dVar.getMessagesController().X3.edit().putBoolean("story_keep", true).apply();
                    v9b.C(dVar.getParentActivity(), dVar.getCurrentAccount()).Q(null);
                    break;
                } else {
                    nhaVar.U0(this.c, nhaVar.m1, dVar);
                    break;
                }
        }
    }
}
