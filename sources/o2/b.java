package o2;

import android.os.Build;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class b extends c {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, String str, String str2) {
        super(str, str2);
        this.d = i10;
    }

    @Override // o2.c
    public final boolean a() {
        switch (this.d) {
            case 0:
                if (Build.VERSION.SDK_INT >= 23) {
                }
                break;
            case 1:
                if (Build.VERSION.SDK_INT >= 24) {
                }
                break;
            case 2:
                break;
            case 3:
                if (Build.VERSION.SDK_INT >= 26) {
                }
                break;
            case 4:
                if (Build.VERSION.SDK_INT >= 27) {
                }
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 28) {
                }
                break;
            default:
                if (Build.VERSION.SDK_INT >= 29) {
                }
                break;
        }
        return false;
    }
}
