package g5;

import java.io.IOException;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class n extends IOException {
    public static final /* synthetic */ int b = 0;
    public final int a;

    public n(int i10) {
        this.a = i10;
    }

    public n(Exception exc, int i10) {
        super(exc);
        this.a = i10;
    }

    public n(String str, int i10) {
        super(str);
        this.a = i10;
    }

    public n(String str, Exception exc, int i10) {
        super(str, exc);
        this.a = i10;
    }
}
