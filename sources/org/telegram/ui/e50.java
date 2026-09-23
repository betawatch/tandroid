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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class e50 extends org.telegram.ui.Components.m30 {
    public final /* synthetic */ i50 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e50(i50 i50Var, Context context, TLRPC.Chat chat, boolean z10) {
        super(context, chat, z10);
        this.n = i50Var;
    }

    @Override // org.telegram.ui.Components.m30
    public final void n(int i10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
        alertDialog$Builder.a.I = org.telegram.ui.ActionBar.h6.pg;
        f60 f60Var = this.n.b;
        f60Var.w0 = false;
        alertDialog$Builder.a.R = LocaleController.getString(R.string.VoipGroupStartRecordingTitle);
        if (i10 == 0) {
            alertDialog$Builder.a.T = LocaleController.getString(f60Var.a1.call.rtmp_stream ? R.string.VoipGroupStartRecordingRtmpText : R.string.VoipGroupStartRecordingText);
        } else if (ChatObject.isChannelOrGiga(f60Var.Z0)) {
            alertDialog$Builder.a.T = LocaleController.getString(f60Var.a1.call.rtmp_stream ? R.string.VoipGroupStartRecordingRtmpVideoText : R.string.VoipChannelStartRecordingVideoText);
        } else {
            alertDialog$Builder.a.T = LocaleController.getString(f60Var.a1.call.rtmp_stream ? R.string.VoipGroupStartRecordingRtmpVideoText : R.string.VoipGroupStartRecordingVideoText);
        }
        alertDialog$Builder.a.y0 = false;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext());
        editTextBoldCursor.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.T(getContext(), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.nh, false), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.oh, false)));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        editTextBoldCursor.setTextSize(1, 16.0f);
        int i11 = org.telegram.ui.ActionBar.h6.ng;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setInputType(16385);
        editTextBoldCursor.setGravity(51);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setHint(LocaleController.getString(R.string.VoipGroupSaveFileHint));
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.og, false));
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
        editTextBoldCursor.setCursorWidth(1.5f);
        editTextBoldCursor.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        linearLayout.addView(editTextBoldCursor, w7.x5.t(-1, 36, 51, 24, 0, 24, 12));
        editTextBoldCursor.setOnEditorActionListener(new uz(alertDialog$Builder, 2));
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.fg, false);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.i(w02);
        b2Var.setOnShowListener(new d50(this, b2Var, editTextBoldCursor, 1));
        b2Var.setOnDismissListener(new vz(2, editTextBoldCursor));
        alertDialog$Builder.k(LocaleController.getString(R.string.Start), new gg.d2(this, editTextBoldCursor, i10, 11));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new tz(2, editTextBoldCursor));
        int w03 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.ug, false);
        org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.a;
        b2Var2.i(w03);
        b2Var2.show();
        b2Var2.o(org.telegram.ui.ActionBar.h6.w0(null, i11, false));
        editTextBoldCursor.requestFocus();
    }
}
