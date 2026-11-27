// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class hs extends c79 {
    public final Context c;
    public final /* synthetic */ is d;

    public hs(is isVar, Context context) {
        this.d = isVar;
        this.c = context;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return f89Var.f == 0;
    }

    @Override // j79
    public final int b() {
        return this.d.H;
    }

    @Override // j79
    public final int d(int i) {
        is isVar = this.d;
        if (i >= isVar.y && i < isVar.E) {
            return 0;
        }
        if (i == isVar.F) {
            return 1;
        }
        return (i == isVar.G || i == isVar.x) ? 2 : 0;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        int i2;
        View view = f89Var.a;
        is isVar = this.d;
        ArrayList arrayList = isVar.h;
        if (d(i) != 0) {
            if (d(i) == 2) {
                ilb ilbVar = (ilb) view;
                if (i == isVar.x) {
                    ilbVar.setTopPadding(17);
                    ilbVar.setBottomPadding(10);
                    ilbVar.setText(ob6.M0(isVar.I == 5 ? 2131754128 : 2131754117, null));
                    return;
                } else {
                    ilbVar.setTopPadding(10);
                    ilbVar.setBottomPadding(17);
                    ilbVar.setText(null);
                    return;
                }
            }
            return;
        }
        int i3 = i - isVar.y;
        fs fsVar = (fs) view;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i3);
        fsVar.b(stickerSetCovered, i3 != arrayList.size() - 1);
        uv8 uv8Var = fsVar.f;
        i2 = ((e) isVar).currentAccount;
        boolean D0 = ls6.d0(i2).D0(stickerSetCovered.set.id, true);
        fsVar.a(D0, false, false);
        zh6 zh6Var = isVar.a;
        if (D0) {
            zh6Var.l(stickerSetCovered.set.id);
            if (uv8Var != null) {
                uv8Var.a(false, false);
            }
        } else {
            boolean z = zh6Var.h(stickerSetCovered.set.id) >= 0;
            if (uv8Var != null) {
                uv8Var.a(z, false);
            }
        }
        fsVar.setOnCheckedChangeListener(new o(this, stickerSetCovered, (byte) 13));
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        Context context = this.c;
        View view = null;
        if (i == 0) {
            fs fsVar = new fs(context, true);
            yob.h(aob.d6, null, fsVar);
            view = fsVar;
        } else if (i == 1) {
            view = new ua6(context);
        } else if (i == 2) {
            view = new ilb(context);
        }
        view.setLayoutParams(new r79(-1, -2));
        return new n69(view);
    }
}
