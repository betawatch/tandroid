// default package

/* loaded from: classes.dex */
public final class bsd {
    public static ord a(Object obj, Object obj2) {
        ord ordVar = (ord) obj;
        ord ordVar2 = (ord) obj2;
        if (!ordVar2.isEmpty()) {
            if (!ordVar.a) {
                if (ordVar.isEmpty()) {
                    ordVar = new ord();
                } else {
                    ord ordVar3 = new ord(ordVar);
                    ordVar3.a = true;
                    ordVar = ordVar3;
                }
            }
            ordVar.b();
            if (!ordVar2.isEmpty()) {
                ordVar.putAll(ordVar2);
            }
        }
        return ordVar;
    }
}
