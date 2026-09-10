package b5;

import android.os.Build;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
