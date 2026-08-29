package org.telegram.ui;

import android.content.Context;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class q40 extends org.telegram.ui.Components.i30 {
    public final /* synthetic */ u40 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q40(u40 u40Var, Context context, TLRPC.Chat chat, boolean z10) {
        super(context, chat, z10);
        this.n = u40Var;
    }

    @Override // org.telegram.ui.Components.i30
    public final void n(int i10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.a.E = org.telegram.ui.ActionBar.g6.pg;
        r50 r50Var = this.n.b;
        r50Var.s0 = false;
        alertDialog$Builder.a.N = LocaleController.getString(R.string.VoipGroupStartRecordingTitle);
        if (i10 == 0) {
            alertDialog$Builder.a.P = LocaleController.getString(r50Var.W0.call.rtmp_stream ? R.string.VoipGroupStartRecordingRtmpText : R.string.VoipGroupStartRecordingText);
        } else if (ChatObject.isChannelOrGiga(r50Var.V0)) {
            alertDialog$Builder.a.P = LocaleController.getString(r50Var.W0.call.rtmp_stream ? R.string.VoipGroupStartRecordingRtmpVideoText : R.string.VoipChannelStartRecordingVideoText);
        } else {
            alertDialog$Builder.a.P = LocaleController.getString(r50Var.W0.call.rtmp_stream ? R.string.VoipGroupStartRecordingRtmpVideoText : R.string.VoipGroupStartRecordingVideoText);
        }
        alertDialog$Builder.a.u0 = false;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.T(getContext(), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.nh, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.oh, false)));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i11 = org.telegram.ui.ActionBar.g6.ng;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setHint(LocaleController.getString(R.string.VoipGroupSaveFileHint));
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.og, false));
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, i7.f6.t(-1, 36, 51, 24, 0, 24, 12));
        editTextBoldCursor.setOnEditorActionListener(new iz(alertDialog$Builder, 2));
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.fg, false);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.i(w02);
        c2Var.setOnShowListener(new p40(this, c2Var, editTextBoldCursor, 1));
        c2Var.setOnDismissListener(new jz(2, editTextBoldCursor));
        alertDialog$Builder.k(LocaleController.getString(R.string.Start), new e3.d(this, editTextBoldCursor, i10, 8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new hz(2, editTextBoldCursor));
        int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.ug, false);
        org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.a;
        c2Var2.i(w03);
        c2Var2.show();
        c2Var2.o(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        editTextBoldCursor.requestFocus();
    }
}
