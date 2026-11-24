// default package

import android.content.ClipData;
import android.view.ContentInfo;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class fv2 implements gv2 {
    public final ContentInfo a;

    public fv2(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.a = contentInfo;
    }

    @Override // gv2
    public final int a() {
        return this.a.getFlags();
    }

    @Override // gv2
    public final ClipData b() {
        return this.a.getClip();
    }

    @Override // gv2
    public final ContentInfo e() {
        return this.a;
    }

    @Override // gv2
    public final int f() {
        return this.a.getSource();
    }

    public final String toString() {
        return "ContentInfoCompat{" + this.a + "}";
    }
}
