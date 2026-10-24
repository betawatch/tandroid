package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class a00 extends j00 {
    public final /* synthetic */ b00 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a00(b00 b00Var, Context context, int i10, int i11) {
        super(context, null, i10, i11);
        this.E = b00Var;
    }

    @Override // org.telegram.ui.j00
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        b00 b00Var = this.E;
        b00Var.d.Z.remove(tL_exportedChatlistInvite);
        b00Var.d.T();
        b00Var.d.U(true);
    }

    @Override // org.telegram.ui.j00
    public final void c() {
        org.telegram.ui.Components.j80 F = org.telegram.ui.Components.j80.F(this.E.d.container, null, this);
        final int i10 = 0;
        F.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyLink), new Runnable(this) { // from class: org.telegram.ui.zz
            public final /* synthetic */ a00 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        a00 a00Var = this.b;
                        String str = a00Var.x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.xc(a00Var.E.d.a0, null).k(false).j();
                            break;
                        }
                        break;
                    case 1:
                        this.b.d();
                        break;
                    default:
                        this.b.a();
                        break;
                }
            }
        }, false);
        final int i11 = 1;
        F.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new Runnable(this) { // from class: org.telegram.ui.zz
            public final /* synthetic */ a00 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        a00 a00Var = this.b;
                        String str = a00Var.x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.xc(a00Var.E.d.a0, null).k(false).j();
                            break;
                        }
                        break;
                    case 1:
                        this.b.d();
                        break;
                    default:
                        this.b.a();
                        break;
                }
            }
        }, false);
        final int i12 = 2;
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteLink), new Runnable(this) { // from class: org.telegram.ui.zz
            public final /* synthetic */ a00 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        a00 a00Var = this.b;
                        String str = a00Var.x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.xc(a00Var.E.d.a0, null).k(false).j();
                            break;
                        }
                        break;
                    case 1:
                        this.b.d();
                        break;
                    default:
                        this.b.a();
                        break;
                }
            }
        }, true);
        if (LocaleController.isRTL) {
            F.i = 3;
        }
        F.Z();
    }
}
