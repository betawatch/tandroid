package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final /* synthetic */ class x3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ((FilesMigrationService.FilesMigrationBottomSheet) this.b).lambda$new$0(view);
                break;
            default:
                MessagesController.lambda$checkSensitive$445((boolean[]) this.b, view);
                break;
        }
    }
}
