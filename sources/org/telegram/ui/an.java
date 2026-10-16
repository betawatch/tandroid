package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class an extends zu0 {
    public final ArrayList a;
    public final int[] b = new int[2];
    public final /* synthetic */ fo c;

    public an(fo foVar, ArrayList arrayList) {
        this.c = foVar;
        this.a = arrayList;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final jv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject messageObject2;
        RichMessageLayout richMessageLayout;
        fo foVar = this.c;
        if (foVar.x0 != null && i10 >= 0) {
            ArrayList arrayList = this.a;
            if (i10 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i10);
                int childCount = foVar.x0.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = foVar.x0.getChildAt(i11);
                    boolean z12 = childAt instanceof org.telegram.ui.Cells.u1;
                    int[] iArr = this.b;
                    if (!z12 || (messageObject2 = (u1Var = (org.telegram.ui.Cells.u1) childAt).getMessageObject()) == null || (richMessageLayout = messageObject2.richLayout) == null) {
                        imageReceiver = null;
                    } else {
                        int[] iArr2 = new int[2];
                        imageReceiver = richMessageLayout.findMediaImageReceiver(pageBlock, iArr2);
                        if (imageReceiver != null) {
                            childAt.getLocationInWindow(iArr);
                            iArr[0] = u1Var.getTextX() + iArr2[0] + iArr[0];
                            iArr[1] = u1Var.getTextY() + iArr2[1] + iArr[1];
                        }
                    }
                    if (imageReceiver != null) {
                        jv0 jv0Var = new jv0();
                        jv0Var.b = iArr[0];
                        jv0Var.c = iArr[1];
                        jv0Var.d = foVar.x0;
                        jv0Var.a = imageReceiver;
                        jv0Var.e = imageReceiver.getBitmapSafe();
                        jv0Var.h = imageReceiver.getRoundRadius(true);
                        jv0Var.j = (int) ((foVar.s9 - foVar.u9) - AndroidUtilities.dp(4.0f));
                        jv0Var.i = (int) (foVar.b9(org.telegram.ui.Components.u31.c) + foVar.v.d() + AndroidUtilities.dp(9.0f) + foVar.Ba + foVar.sc);
                        return jv0Var;
                    }
                }
            }
        }
        return null;
    }
}
