package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class m00 extends v00 {
    public final /* synthetic */ n00 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m00(n00 n00Var, Context context, int i10, int i11) {
        super(context, null, i10, i11);
        this.B = n00Var;
    }

    @Override // org.telegram.ui.v00
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        n00 n00Var = this.B;
        n00Var.d.V.remove(tL_exportedChatlistInvite);
        n00Var.d.T();
        n00Var.d.U(true);
    }

    @Override // org.telegram.ui.v00
    public final void c() {
        org.telegram.ui.Components.p70 F = org.telegram.ui.Components.p70.F(this.B.d.container, null, this);
        final int i10 = 0;
        F.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyLink), new Runnable(this) { // from class: org.telegram.ui.l00
            public final /* synthetic */ m00 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        m00 m00Var = this.b;
                        String str = m00Var.x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.qc(m00Var.B.d.W, null).k(false).j();
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
        F.c(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new Runnable(this) { // from class: org.telegram.ui.l00
            public final /* synthetic */ m00 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        m00 m00Var = this.b;
                        String str = m00Var.x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.qc(m00Var.B.d.W, null).k(false).j();
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
        F.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteLink), new Runnable(this) { // from class: org.telegram.ui.l00
            public final /* synthetic */ m00 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        m00 m00Var = this.b;
                        String str = m00Var.x;
                        if (str != null && AndroidUtilities.addToClipboard(str)) {
                            new org.telegram.ui.Components.qc(m00Var.B.d.W, null).k(false).j();
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
