package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final /* synthetic */ class v3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v3(Object obj, int i10) {
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
