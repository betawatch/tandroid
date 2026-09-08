package org.telegram.ui.Components;

import android.content.DialogInterface;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class z1 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int[] c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ z1(int i10, int[] iArr, org.telegram.ui.r80 r80Var) {
        this.b = i10;
        this.c = iArr;
        this.d = r80Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.a;
        Runnable runnable = this.d;
        int[] iArr = this.c;
        int i11 = this.b;
        switch (i10) {
            case 0:
                for (int i12 : iArr) {
                    if (i12 != 0) {
                        ConnectionsManager.getInstance(i11).cancelRequest(i12, true);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            default:
                Pattern pattern = LaunchActivity.B1;
                ConnectionsManager.getInstance(i11).cancelRequest(iArr[0], true);
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ z1(int[] iArr, Runnable runnable, int i10) {
        this.c = iArr;
        this.b = i10;
        this.d = runnable;
    }
}
