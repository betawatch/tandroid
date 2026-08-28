package org.telegram.ui;

import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o71 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o71(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0144  */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        String str;
        String str2;
        String str3;
        JSONException jSONException;
        rf.b d02;
        long[] jArr;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n21(7, (z71) this.b, (TLRPC.TL_attachMenuBot) this.c));
                break;
            case 1:
                e91 e91Var = (e91) this.b;
                Utilities.Callback0Return callback0Return = (Utilities.Callback0Return) this.c;
                int i9 = e91Var.i;
                String str4 = null;
                if (tL_error == null) {
                    if (tLObject instanceof TL_stats.TL_statsGraph) {
                        try {
                            d02 = s91.d0(new JSONObject(((TL_stats.TL_statsGraph) tLObject).json.data), i9, e91Var.m);
                        } catch (JSONException e10) {
                            jSONException = e10;
                            str3 = null;
                        }
                        try {
                            str4 = ((TL_stats.TL_statsGraph) tLObject).zoom_token;
                            if (i9 == 4 && (jArr = d02.a) != null && jArr.length > 0) {
                                long j10 = jArr[jArr.length - 1];
                                e91Var.e = new rf.e(d02, j10);
                                e91Var.c = j10;
                            }
                            str3 = str4;
                            str4 = d02;
                        } catch (JSONException e11) {
                            jSONException = e11;
                            str3 = str4;
                            str4 = d02;
                            jSONException.printStackTrace();
                            if (tLObject instanceof TL_stats.TL_statsGraphError) {
                            }
                            str = str4;
                            str2 = str3;
                            AndroidUtilities.runOnUIThread(new ir0(e91Var, str, str2, callback0Return, 16));
                            return;
                        }
                    } else {
                        str3 = null;
                    }
                    if (tLObject instanceof TL_stats.TL_statsGraphError) {
                        e91Var.l = false;
                        e91Var.a = true;
                        e91Var.b = ((TL_stats.TL_statsGraphError) tLObject).error;
                    }
                    str = str4;
                    str2 = str3;
                } else {
                    str = null;
                    str2 = null;
                }
                AndroidUtilities.runOnUIThread(new ir0(e91Var, str, str2, callback0Return, 16));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new qc1((tc1) this.b, (String) this.c, tL_error, 0));
                break;
            case 3:
                tc1 tc1Var = (tc1) this.b;
                TL_account.updateTheme updatetheme = (TL_account.updateTheme) this.c;
                if (!(tLObject instanceof TLRPC.TL_theme)) {
                    AndroidUtilities.runOnUIThread(new qc1(tc1Var, tL_error, updatetheme));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new n21(15, tc1Var, (TLRPC.TL_theme) tLObject));
                    break;
                }
            case 4:
                AndroidUtilities.runOnUIThread(new qc1((re1) this.b, (String) this.c, tLObject, 5));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new ir0((ag1) this.b, tLObject, (String) this.c, tL_error, 19));
                break;
            case 6:
                ag1 ag1Var = (ag1) this.b;
                byte[] bArr = (byte[]) this.c;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new wf1(ag1Var, tL_error, 3));
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new uf1(ag1Var, bArr, 1));
                    break;
                }
            case 7:
                AndroidUtilities.runOnUIThread(new n21(29, (uh1) this.b, (int[]) this.c));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new pf.a(this.b, tLObject, this.c, 2));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new ai1(13, (pf.g0) this.b, (org.telegram.ui.Components.qd) this.c));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new pf.a(this.b, tLObject, this.c, 7));
                break;
            default:
                AndroidUtilities.runOnUIThread(new ir0((yf.m2) this.b, tLObject, (yf.k2) this.c, tL_error, 26));
                break;
        }
    }
}
