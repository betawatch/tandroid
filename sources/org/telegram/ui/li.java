package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class li implements org.telegram.ui.Components.dl0 {
    public final /* synthetic */ bo a;

    public li(bo boVar) {
        this.a = boVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    @Override // org.telegram.ui.Components.dl0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(float f7, float f10, int i10, View view) {
        boolean z10;
        boolean z11;
        org.telegram.ui.ActionBar.k kVar;
        View view2;
        boolean z12;
        bo boVar = this.a;
        um umVar = boVar.c9;
        if ((umVar == null || !umVar.z) && !boVar.b9()) {
            z10 = ((org.telegram.ui.ActionBar.o2) boVar).inPreviewMode;
            if (!z10 && !boVar.Oa) {
                boVar.D4 = true;
                if (view instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
                    MessageObject messageObject = w0Var.getMessageObject();
                    if (messageObject != null) {
                        if (!(messageObject.messageOwner.action instanceof TLRPC.TL_messageActionSetMessagesTTL) && w0Var.getMessageObject().type != 21 && !w0Var.getMessageObject().isWallpaperAction() && w0Var.getMessageObject().type != 30) {
                            z11 = false;
                            kVar = ((org.telegram.ui.ActionBar.o2) boVar).actionBar;
                            if (!kVar.s() || (boVar.A9() && !z11)) {
                                view2 = view;
                                bo.b2(boVar, view2, view2 instanceof org.telegram.ui.Cells.t1 ? !((org.telegram.ui.Cells.t1) view2).i3(f7) : false, f7, f10);
                                z12 = true;
                            } else {
                                view2 = view;
                                z12 = boVar.I7(view2, false, true, f7, f10, true, true, false);
                            }
                            if (view2 instanceof org.telegram.ui.Cells.t1) {
                                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view2;
                                if (t1Var.getMessageObject() != null && t1Var.getMessageObject().type != 27) {
                                    bo.c2(boVar, i10);
                                    return true;
                                }
                            }
                            return z12;
                        }
                    }
                }
                z11 = true;
                kVar = ((org.telegram.ui.ActionBar.o2) boVar).actionBar;
                if (kVar.s()) {
                }
                view2 = view;
                bo.b2(boVar, view2, view2 instanceof org.telegram.ui.Cells.t1 ? !((org.telegram.ui.Cells.t1) view2).i3(f7) : false, f7, f10);
                z12 = true;
                if (view2 instanceof org.telegram.ui.Cells.t1) {
                }
                return z12;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.dl0
    public final /* synthetic */ void g() {
    }

    @Override // org.telegram.ui.Components.dl0
    public final /* synthetic */ void q(float f7) {
    }
}
