package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class e4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e4(Object obj, int i10) {
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
                MessagesController.lambda$checkSensitive$451((boolean[]) this.b, view);
                break;
        }
    }
}
