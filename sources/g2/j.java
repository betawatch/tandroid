package g2;

import java.io.IOException;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public class j extends IOException {
    public static final /* synthetic */ int b = 0;
    public final int a;

    public j(int i10) {
        this.a = i10;
    }

    public j(Exception exc, int i10) {
        super(exc);
        this.a = i10;
    }

    public j(String str, int i10) {
        super(str);
        this.a = i10;
    }

    public j(String str, Exception exc, int i10) {
        super(str, exc);
        this.a = i10;
    }
}
