// default package

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class f63 extends ccb implements eq4 {
    public Iterator a;
    public vfa b;
    public Object c;
    public byte d;
    public /* synthetic */ Object e;
    public final /* synthetic */ List f;
    public final /* synthetic */ ArrayList h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f63(List list, ArrayList arrayList, fw2 fw2Var) {
        super(2, fw2Var);
        this.f = list;
        this.h = arrayList;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        f63 f63Var = new f63(this.f, this.h, fw2Var);
        f63Var.e = obj;
        return f63Var;
    }

    @Override // eq4
    public final Object invoke(Object obj, Object obj2) {
        return ((f63) create(obj, (fw2) obj2)).invokeSuspend(g5c.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0043  */
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        vfa vfaVar;
        Iterator it2;
        Object obj2;
        byte b = this.d;
        bx2 bx2Var = bx2.a;
        if (b == 0) {
            qse.b(obj);
            obj = this.e;
            it = this.f.iterator();
            list = this.h;
        } else if (b == 1) {
            obj2 = this.c;
            vfa vfaVar2 = this.b;
            it2 = this.a;
            List list2 = (List) this.e;
            qse.b(obj);
            vfaVar = vfaVar2;
            list = list2;
            if (!((Boolean) obj).booleanValue()) {
                list.add(new e63(vfaVar, null, (byte) 0));
                this.e = list;
                this.a = it2;
                this.b = null;
                this.c = null;
                this.d = (byte) 2;
                obj = vfaVar.b.a(new zfa((SharedPreferences) vfaVar.e.getValue(), vfaVar.f), obj2, this);
                if (obj != bx2Var) {
                    it = it2;
                }
                return bx2Var;
            }
            obj = obj2;
            it = it2;
        } else {
            if (b != 2) {
                sc8.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = this.a;
            list = (List) this.e;
            qse.b(obj);
        }
        if (!it.hasNext()) {
            vfa vfaVar3 = (vfa) it.next();
            this.e = list;
            this.a = it;
            this.b = vfaVar3;
            this.c = obj;
            this.d = (byte) 1;
            Object a = vfaVar3.a(obj, this);
            if (a != bx2Var) {
                Iterator it3 = it;
                obj2 = obj;
                obj = a;
                vfaVar = vfaVar3;
                it2 = it3;
                if (!((Boolean) obj).booleanValue()) {
                }
                if (!it.hasNext()) {
                    return obj;
                }
            }
            return bx2Var;
        }
    }
}
