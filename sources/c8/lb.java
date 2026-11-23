package c8;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public abstract class lb {
    public static void a(int i7, Object[] objArr) {
        for (int i10 = 0; i10 < i7; i10++) {
            if (objArr[i10] == null) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 9);
                sb2.append("at index ");
                sb2.append(i10);
                throw new NullPointerException(sb2.toString());
            }
        }
    }
}
