package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class dq0 implements org.telegram.ui.Components.c30 {
    public final /* synthetic */ PhotoViewer a;

    public dq0(PhotoViewer photoViewer) {
        this.a = photoViewer;
    }

    public final void a(int i10) {
        PhotoViewer photoViewer = this.a;
        photoViewer.P4 = -1;
        org.telegram.messenger.kc kcVar = photoViewer.j5;
        if (kcVar != null) {
            kcVar.a();
            photoViewer.j5 = null;
        }
        photoViewer.l5 = true;
        photoViewer.E2(i10);
        photoViewer.l5 = false;
    }
}
