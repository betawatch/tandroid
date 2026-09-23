package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class l00 extends v00 {
    public final /* synthetic */ m00 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l00(m00 m00Var, Context context, int i10, int i11) {
        super(context, null, i10, i11);
        this.E = m00Var;
    }

    @Override // org.telegram.ui.v00
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        m00 m00Var = this.E;
        m00Var.d.Y.remove(tL_exportedChatlistInvite);
        m00Var.d.T();
        m00Var.d.U(true);
    }

    @Override // org.telegram.ui.v00
    public final void c() {
        org.telegram.ui.Components.o70 F = org.telegram.ui.Components.o70.F(this.E.d.container, null, this);
        final int i10 = 0;
        F.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyLink), new Runnable(this) { // from class: org.telegram.ui.k00
            public final /* synthetic */ l00 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        l00 l00Var = this.b;
                        String str = l00Var.x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.xc(l00Var.E.d.Z, null).k(false).j();
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
        F.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new Runnable(this) { // from class: org.telegram.ui.k00
            public final /* synthetic */ l00 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        l00 l00Var = this.b;
                        String str = l00Var.x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.xc(l00Var.E.d.Z, null).k(false).j();
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
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteLink), new Runnable(this) { // from class: org.telegram.ui.k00
            public final /* synthetic */ l00 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        l00 l00Var = this.b;
                        String str = l00Var.x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.xc(l00Var.E.d.Z, null).k(false).j();
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
