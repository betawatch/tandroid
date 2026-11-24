// default package

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class m02 implements s58 {
    public boolean a;
    public final /* synthetic */ HashMap b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ x02 d;

    public m02(x02 x02Var, HashMap hashMap, ArrayList arrayList) {
        this.d = x02Var;
        this.b = hashMap;
        this.c = arrayList;
    }

    @Override // s58
    public final boolean c() {
        return true;
    }

    @Override // s58
    public final void l(int i, boolean z, boolean z2) {
        if (z) {
            return;
        }
        HashMap hashMap = this.b;
        if (hashMap.isEmpty() || this.a) {
            return;
        }
        this.a = true;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.c;
            if (i2 >= arrayList2.size()) {
                ((mu1) this.d.Z1).m6(i, arrayList, z2);
                return;
            }
            Object obj = hashMap.get(arrayList2.get(i2));
            y3a y3aVar = new y3a();
            arrayList.add(y3aVar);
            nm6 nm6Var = (nm6) obj;
            String str = nm6Var.h;
            if (str != null) {
                y3aVar.c = str;
            } else {
                y3aVar.l = nm6Var;
            }
            y3aVar.e = nm6Var.c;
            y3aVar.k = nm6Var.s;
            CharSequence charSequence = nm6Var.I;
            y3aVar.d = charSequence != null ? charSequence.toString() : null;
            y3aVar.i = nm6Var.n;
            y3aVar.j = nm6Var.r;
            y3aVar.h = nm6Var.x;
            TLRPC.BotInlineResult botInlineResult = nm6Var.N;
            if (botInlineResult != null && nm6Var.H) {
                y3aVar.m = botInlineResult;
                y3aVar.n = nm6Var.O;
            }
            System.currentTimeMillis();
            i2++;
        }
    }

    @Override // s58
    public final void e() {
    }

    @Override // s58
    public final void k() {
    }

    @Override // s58
    public final void j(Editable editable) {
    }
}
