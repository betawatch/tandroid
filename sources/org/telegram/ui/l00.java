package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class l00 extends u00 {
    public final /* synthetic */ m00 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l00(m00 m00Var, Context context, int i10, int i11) {
        super(context, null, i10, i11);
        this.B = m00Var;
    }

    @Override // org.telegram.ui.u00
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        m00 m00Var = this.B;
        m00Var.d.V.remove(tL_exportedChatlistInvite);
        m00Var.d.T();
        m00Var.d.U(true);
    }

    @Override // org.telegram.ui.u00
    public final void c() {
        org.telegram.ui.Components.o70 F = org.telegram.ui.Components.o70.F(this.B.d.container, null, this);
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
                            new org.telegram.ui.Components.qc(l00Var.B.d.W, null).k(false).j();
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
                            new org.telegram.ui.Components.qc(l00Var.B.d.W, null).k(false).j();
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
                            new org.telegram.ui.Components.qc(l00Var.B.d.W, null).k(false).j();
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
