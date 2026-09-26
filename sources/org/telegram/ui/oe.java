package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oe implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ oe(wn wnVar, int i10) {
        this.a = i10;
        this.b = wnVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final wn wnVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.lf
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                wn.s1(wnVar, tLObject);
                                break;
                            case 1:
                                wn.m0(wnVar, tLObject);
                                break;
                            case 2:
                                wn wnVar2 = wnVar;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.xc.a(wnVar2)) {
                                            org.telegram.ui.Components.xc.a0(wnVar2).k(!wnVar2.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                }
                                break;
                            default:
                                wn wnVar3 = wnVar;
                                TLObject tLObject3 = tLObject;
                                wnVar3.o5 = 0;
                                if (tLObject3 == null && wnVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar3.getParentActivity(), 0, wnVar3.ea);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    wnVar3.showDialog(alertDialog$Builder.a);
                                    jk jkVar = wnVar3.Y;
                                    if (jkVar != null) {
                                        jkVar.c1(null, null, false);
                                        wnVar3.e9(true);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i11 = 1;
                final wn wnVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.lf
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                wn.s1(wnVar2, tLObject);
                                break;
                            case 1:
                                wn.m0(wnVar2, tLObject);
                                break;
                            case 2:
                                wn wnVar22 = wnVar2;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.xc.a(wnVar22)) {
                                            org.telegram.ui.Components.xc.a0(wnVar22).k(!wnVar22.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                }
                                break;
                            default:
                                wn wnVar3 = wnVar2;
                                TLObject tLObject3 = tLObject;
                                wnVar3.o5 = 0;
                                if (tLObject3 == null && wnVar3.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar3.getParentActivity(), 0, wnVar3.ea);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    wnVar3.showDialog(alertDialog$Builder.a);
                                    jk jkVar = wnVar3.Y;
                                    if (jkVar != null) {
                                        jkVar.c1(null, null, false);
                                        wnVar3.e9(true);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i12 = 2;
                final wn wnVar3 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.lf
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i12) {
                            case 0:
                                wn.s1(wnVar3, tLObject);
                                break;
                            case 1:
                                wn.m0(wnVar3, tLObject);
                                break;
                            case 2:
                                wn wnVar22 = wnVar3;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.xc.a(wnVar22)) {
                                            org.telegram.ui.Components.xc.a0(wnVar22).k(!wnVar22.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                }
                                break;
                            default:
                                wn wnVar32 = wnVar3;
                                TLObject tLObject3 = tLObject;
                                wnVar32.o5 = 0;
                                if (tLObject3 == null && wnVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar32.getParentActivity(), 0, wnVar32.ea);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    wnVar32.showDialog(alertDialog$Builder.a);
                                    jk jkVar = wnVar32.Y;
                                    if (jkVar != null) {
                                        jkVar.c1(null, null, false);
                                        wnVar32.e9(true);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                final int i13 = 3;
                final wn wnVar4 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.lf
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i13) {
                            case 0:
                                wn.s1(wnVar4, tLObject);
                                break;
                            case 1:
                                wn.m0(wnVar4, tLObject);
                                break;
                            case 2:
                                wn wnVar22 = wnVar4;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    TLRPC.TL_exportedMessageLink tL_exportedMessageLink = (TLRPC.TL_exportedMessageLink) tLObject2;
                                    try {
                                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", tL_exportedMessageLink.link));
                                        if (org.telegram.ui.Components.xc.a(wnVar22)) {
                                            org.telegram.ui.Components.xc.a0(wnVar22).k(!wnVar22.F9() && tL_exportedMessageLink.link.contains("/c/")).j();
                                            break;
                                        }
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        return;
                                    }
                                }
                                break;
                            default:
                                wn wnVar32 = wnVar4;
                                TLObject tLObject3 = tLObject;
                                wnVar32.o5 = 0;
                                if (tLObject3 == null && wnVar32.getParentActivity() != null) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar32.getParentActivity(), 0, wnVar32.ea);
                                    alertDialog$Builder.a.R = LocaleController.getString(R.string.AppName);
                                    alertDialog$Builder.a.T = LocaleController.getString(R.string.EditMessageError);
                                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                                    wnVar32.showDialog(alertDialog$Builder.a);
                                    jk jkVar = wnVar32.Y;
                                    if (jkVar != null) {
                                        jkVar.c1(null, null, false);
                                        wnVar32.e9(true);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            case 4:
                wn wnVar5 = this.b;
                if (tL_error == null) {
                    wnVar5.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    break;
                } else {
                    wnVar5.getClass();
                    break;
                }
            default:
                wn.c1(this.b, tLObject);
                break;
        }
    }
}
