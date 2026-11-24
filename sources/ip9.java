// default package

import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ip9 extends c6 {
    public final /* synthetic */ pp9 a;

    public ip9(pp9 pp9Var) {
        this.a = pp9Var;
    }

    @Override // c6
    public final void b(int i) {
        final pp9 pp9Var = this.a;
        qd2 qd2Var = pp9Var.c;
        pp9Var.j();
        if (i == -1) {
            pp9Var.onBackPressed();
            return;
        }
        final byte b = 1;
        if (i == 1) {
            tp9.f(pp9Var.a);
            return;
        }
        if (i == 9) {
            pp9Var.f();
            return;
        }
        final byte b2 = 0;
        if (i == 10) {
            AlertDialog$Builder c = pp9Var.c();
            he heVar = c.a;
            heVar.S = jb6.M0(sd2.W(pp9Var.d) ? 2131743137 : 2131743004, null);
            TLRPC.Chat chat = pp9Var.d;
            final EditTextBoldCursor d = pp9Var.d(c, chat != null ? chat.title : "");
            d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(40)});
            if (!TextUtils.isEmpty(qd2Var.b.title)) {
                d.setText(qd2Var.b.title);
                d.setSelection(d.length());
            }
            c.j(jb6.M0(2131745680, null), new ee() { // from class: ap9
                @Override // ee
                public final void r(he heVar2, int i2) {
                    byte b3 = b;
                    EditTextBoldCursor editTextBoldCursor = d;
                    pp9 pp9Var2 = pp9Var;
                    switch (b3) {
                        case 0:
                            gm.t1(editTextBoldCursor);
                            pp9Var2.c.C(2, editTextBoldCursor.getText().toString());
                            pp9Var2.J.j(100, 0L, null);
                            if (VoIPService.getSharedInstance() != null) {
                                VoIPService.getSharedInstance().playStartRecordSound();
                                break;
                            }
                            break;
                        default:
                            gm.t1(editTextBoldCursor);
                            pp9Var2.c.z(editTextBoldCursor.getText().toString());
                            break;
                    }
                }
            });
            c.g(jb6.M0(2131752542, null), new uu3(d, (byte) 5));
            heVar.setOnShowListener(new he4(d, (byte) 2));
            d.setOnEditorActionListener(new dp9(heVar, b2));
            pp9.o(heVar);
            return;
        }
        if (i != 11) {
            if (i == 12) {
                AlertDialog$Builder c2 = pp9Var.c();
                he heVar2 = c2.a;
                boolean W = sd2.W(pp9Var.d);
                heVar2.S = jb6.M0(W ? 2131743166 : 2131743065, null);
                heVar2.U = jb6.M0(W ? 2131743167 : 2131743066, null);
                c2.j(jb6.M0(2131743067, null), new bp9(pp9Var));
                c2.g(jb6.M0(2131752542, null), null);
                pp9.o(heVar2);
                View c3 = heVar2.c(-1);
                if (c3 instanceof TextView) {
                    ((TextView) c3).setTextColor(cmb.w0(null, cmb.lh, false));
                    return;
                }
                return;
            }
            return;
        }
        AlertDialog$Builder c4 = pp9Var.c();
        he heVar3 = c4.a;
        if (qd2Var.w) {
            boolean z = qd2Var.b.record_video_active;
            heVar3.S = jb6.M0(2131743005, null);
            heVar3.U = jb6.M0(sd2.W(pp9Var.d) ? 2131743138 : 2131743006, null);
            c4.j(jb6.M0(2131744530, null), new s51((byte) 13, pp9Var, z));
            c4.g(jb6.M0(2131752542, null), null);
            pp9.o(heVar3);
            return;
        }
        heVar3.S = jb6.M0(2131743010, null);
        heVar3.U = jb6.M0(2131743012, null);
        final EditTextBoldCursor d2 = pp9Var.d(c4, jb6.M0(2131743027, null));
        c4.j(jb6.M0(2131744604, null), new ee() { // from class: ap9
            @Override // ee
            public final void r(he heVar22, int i2) {
                byte b3 = b2;
                EditTextBoldCursor editTextBoldCursor = d2;
                pp9 pp9Var2 = pp9Var;
                switch (b3) {
                    case 0:
                        gm.t1(editTextBoldCursor);
                        pp9Var2.c.C(2, editTextBoldCursor.getText().toString());
                        pp9Var2.J.j(100, 0L, null);
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().playStartRecordSound();
                            break;
                        }
                        break;
                    default:
                        gm.t1(editTextBoldCursor);
                        pp9Var2.c.z(editTextBoldCursor.getText().toString());
                        break;
                }
            }
        });
        c4.g(jb6.M0(2131752542, null), new uu3(d2, (byte) 4));
        heVar3.setOnShowListener(new he4(d2, (byte) 2));
        d2.setOnEditorActionListener(new dp9(heVar3, b2));
        pp9.o(heVar3);
    }
}
