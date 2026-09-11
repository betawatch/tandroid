package b5;

import android.os.Build;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public class b extends c {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, String str, String str2) {
        super(str, str2);
        this.d = i10;
    }

    @Override // b5.c
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
