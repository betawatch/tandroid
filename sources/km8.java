// default package

import android.graphics.RectF;
import j$.util.function.Consumer$-CC;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class km8 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ km8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void x(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                RectF rectF = ProfileActivity.Z6;
                HashSet hashSet = profileActivity.n5;
                ArrayList arrayList = new ArrayList((HashSet) obj);
                int i = 0;
                while (i < arrayList.size()) {
                    if (profileActivity.getMessagesController().g4.f(profileActivity.f1, ((Integer) arrayList.get(i)).intValue()) == null) {
                        arrayList.remove(i);
                        i--;
                    }
                    i++;
                }
                hashSet.clear();
                hashSet.addAll(arrayList);
                profileActivity.a4(true);
                break;
            default:
                gl.c3(new iya((u1b) obj2, (List) obj, (byte) 7));
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        byte b = this.a;
        return Consumer$-CC.$default$andThen(this, consumer);
    }
}
