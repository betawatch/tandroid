// default package

import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class hn9 extends c6 {
    public final /* synthetic */ on9 a;

    public hn9(on9 on9Var) {
        this.a = on9Var;
    }

    @Override // c6
    public final void b(int i) {
        final on9 on9Var = this.a;
        fc2 fc2Var = on9Var.c;
        on9Var.j();
        if (i == -1) {
            on9Var.onBackPressed();
            return;
        }
        final byte b = 1;
        if (i == 1) {
            sn9.d(on9Var.a);
            return;
        }
        if (i == 9) {
            on9Var.f();
            return;
        }
        final byte b2 = 0;
        if (i == 10) {
            AlertDialog$Builder c = on9Var.c();
            hd hdVar = c.a;
            hdVar.S = k96.M0(hc2.W(on9Var.d) ? 2131743211 : 2131743078, null);
            TLRPC.Chat chat = on9Var.d;
            final EditTextBoldCursor d = on9Var.d(c, chat != null ? chat.title : "");
            d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(40)});
            if (!TextUtils.isEmpty(fc2Var.b.title)) {
                d.setText(fc2Var.b.title);
                d.setSelection(d.length());
            }
            c.j(k96.M0(2131745754, null), new ed() { // from class: zm9
                @Override // ed
                public final void u(hd hdVar2, int i2) {
                    byte b3 = b;
                    EditTextBoldCursor editTextBoldCursor = d;
                    on9 on9Var2 = on9Var;
                    switch (b3) {
                        case 0:
                            gl.t1(editTextBoldCursor);
                            on9Var2.c.C(2, editTextBoldCursor.getText().toString());
                            on9Var2.J.j(100, 0L, null);
                            if (VoIPService.getSharedInstance() != null) {
                                VoIPService.getSharedInstance().playStartRecordSound();
                                break;
                            }
                            break;
                        default:
                            gl.t1(editTextBoldCursor);
                            on9Var2.c.z(editTextBoldCursor.getText().toString());
                            break;
                    }
                }
            });
            c.g(k96.M0(2131752577, null), new kt3(d, (byte) 5));
            hdVar.setOnShowListener(new hc4(d, (byte) 2));
            d.setOnEditorActionListener(new cn9(hdVar, (byte) 0));
            on9.o(hdVar);
            return;
        }
        if (i != 11) {
            if (i == 12) {
                AlertDialog$Builder c2 = on9Var.c();
                hd hdVar2 = c2.a;
                boolean W = hc2.W(on9Var.d);
                hdVar2.S = k96.M0(W ? 2131743240 : 2131743139, null);
                hdVar2.U = k96.M0(W ? 2131743241 : 2131743140, null);
                c2.j(k96.M0(2131743141, null), new an9(on9Var));
                c2.g(k96.M0(2131752577, null), null);
                on9.o(hdVar2);
                View c3 = hdVar2.c(-1);
                if (c3 instanceof TextView) {
                    ((TextView) c3).setTextColor(bkb.w0(null, bkb.lh, false));
                    return;
                }
                return;
            }
            return;
        }
        AlertDialog$Builder c4 = on9Var.c();
        hd hdVar3 = c4.a;
        if (fc2Var.w) {
            boolean z = fc2Var.b.record_video_active;
            hdVar3.S = k96.M0(2131743079, null);
            hdVar3.U = k96.M0(hc2.W(on9Var.d) ? 2131743212 : 2131743080, null);
            c4.j(k96.M0(2131744604, null), new l41((byte) 13, on9Var, z));
            c4.g(k96.M0(2131752577, null), null);
            on9.o(hdVar3);
            return;
        }
        hdVar3.S = k96.M0(2131743084, null);
        hdVar3.U = k96.M0(2131743086, null);
        final EditTextBoldCursor d2 = on9Var.d(c4, k96.M0(2131743101, null));
        c4.j(k96.M0(2131744678, null), new ed() { // from class: zm9
            @Override // ed
            public final void u(hd hdVar22, int i2) {
                byte b3 = b2;
                EditTextBoldCursor editTextBoldCursor = d2;
                on9 on9Var2 = on9Var;
                switch (b3) {
                    case 0:
                        gl.t1(editTextBoldCursor);
                        on9Var2.c.C(2, editTextBoldCursor.getText().toString());
                        on9Var2.J.j(100, 0L, null);
                        if (VoIPService.getSharedInstance() != null) {
                            VoIPService.getSharedInstance().playStartRecordSound();
                            break;
                        }
                        break;
                    default:
                        gl.t1(editTextBoldCursor);
                        on9Var2.c.z(editTextBoldCursor.getText().toString());
                        break;
                }
            }
        });
        c4.g(k96.M0(2131752577, null), new kt3(d2, (byte) 4));
        hdVar3.setOnShowListener(new hc4(d2, (byte) 2));
        d2.setOnEditorActionListener(new cn9(hdVar3, (byte) 0));
        on9.o(hdVar3);
    }
}
