package org.telegram.ui.Components;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x1 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int[] c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ x1(int i9, int[] iArr, org.telegram.ui.x20 x20Var) {
        this.b = i9;
        this.c = iArr;
        this.d = x20Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i9 = this.a;
        Runnable runnable = this.d;
        int[] iArr = this.c;
        int i10 = this.b;
        switch (i9) {
            case 0:
                for (int i11 : iArr) {
                    if (i11 != 0) {
                        ConnectionsManager.getInstance(i10).cancelRequest(i11, true);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                Pattern pattern = LaunchActivity.x1;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ x1(int[] iArr, Runnable runnable, int i9) {
        this.c = iArr;
        this.b = i9;
        this.d = runnable;
    }
}
