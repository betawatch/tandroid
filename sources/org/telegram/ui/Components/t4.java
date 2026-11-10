package org.telegram.ui.Components;

import java.util.HashSet;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public class t4 extends EditTextBoldCursor implements org.telegram.ui.ActionBar.c6 {
    public boolean G1;
    public int H1;
    public org.telegram.ui.ActionBar.h6 I1;
    public int J1;

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        if (this.G1) {
            hashSet.add(Integer.valueOf(this.H1));
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        int w02;
        try {
            if (this.G1 && (w02 = org.telegram.ui.ActionBar.m6.w0(this.H1, this.I1)) != this.J1) {
                this.J1 = w02;
                setCursorColor(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void z(int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        this.G1 = true;
        this.H1 = i7;
        this.I1 = h6Var;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        this.J1 = w02;
        setCursorColor(w02);
    }
}
