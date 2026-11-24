// default package

import android.app.Activity;
import android.app.Dialog;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class b9b extends d {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v9b b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9b(v9b v9bVar, byte b) {
        super(null);
        this.a = b;
        switch (b) {
            case 1:
                this.b = v9bVar;
                super(null);
                this.currentAccount = v9bVar.c;
                break;
            default:
                this.b = v9bVar;
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final Activity getParentActivity() {
        byte b = this.a;
        v9b v9bVar = this.b;
        switch (b) {
        }
        return v9bVar.b;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ylb getResourceProvider() {
        byte b = this.a;
        v9b v9bVar = this.b;
        switch (b) {
            case 0:
                return new pv0(v9bVar.a, (byte) 8);
            default:
                return new pv0(v9bVar.a, (byte) 9);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        byte b = this.a;
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean presentFragment(d dVar) {
        switch (this.a) {
            case 0:
                this.b.S();
                return false;
            default:
                return super.presentFragment(dVar);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final Dialog showDialog(Dialog dialog) {
        switch (this.a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
