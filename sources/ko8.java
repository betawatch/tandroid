// default package

import android.content.Context;
import android.os.Process;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ko8 {
    public final Context a;
    public final tgb b;
    public final int c;
    public final tgb d;
    public final tgb e;
    public boolean f;

    public ko8(Context context, vcc vccVar) {
        context.getClass();
        vccVar.getClass();
        this.a = context;
        final byte b = 0;
        this.b = new tgb(new sr4(this) { // from class: jo8
            public final /* synthetic */ ko8 b;

            {
                this.b = this;
            }

            @Override // sr4
            public final Object invoke() {
                byte b2 = b;
                ko8 ko8Var = this.b;
                switch (b2) {
                    case 0:
                        return ((mo8) ko8Var.e.getValue()).a;
                    default:
                        return t4.f(ko8Var.a);
                }
            }
        });
        this.c = Process.myPid();
        this.d = new tgb(new gq2(vccVar, (byte) 2));
        final byte b2 = 1;
        this.e = new tgb(new sr4(this) { // from class: jo8
            public final /* synthetic */ ko8 b;

            {
                this.b = this;
            }

            @Override // sr4
            public final Object invoke() {
                byte b22 = b2;
                ko8 ko8Var = this.b;
                switch (b22) {
                    case 0:
                        return ((mo8) ko8Var.e.getValue()).a;
                    default:
                        return t4.f(ko8Var.a);
                }
            }
        });
    }

    public final String a() {
        return (String) this.b.getValue();
    }

    public final Map b(Map map) {
        tgb tgbVar = this.d;
        if (map == null) {
            Map singletonMap = Collections.singletonMap(a(), new io8(Process.myPid(), (String) tgbVar.getValue()));
            singletonMap.getClass();
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(a(), new io8(Process.myPid(), (String) tgbVar.getValue()));
        int size = linkedHashMap.size();
        if (size == 0) {
            return y24.a;
        }
        if (size != 1) {
            return new LinkedHashMap(linkedHashMap);
        }
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map singletonMap2 = Collections.singletonMap(entry.getKey(), entry.getValue());
        singletonMap2.getClass();
        return singletonMap2;
    }
}
