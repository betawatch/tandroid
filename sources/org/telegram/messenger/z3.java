package org.telegram.messenger;

import android.view.View;
import org.telegram.messenger.FilesMigrationService;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class z3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z3(Object obj, int i10) {
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
                MessagesController.lambda$checkSensitive$448((boolean[]) this.b, view);
                break;
        }
    }
}
