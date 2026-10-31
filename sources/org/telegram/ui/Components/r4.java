package org.telegram.ui.Components;

import java.util.HashSet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class r4 extends EditTextBoldCursor implements org.telegram.ui.ActionBar.k6 {
    public boolean G1;
    public int H1;
    public org.telegram.ui.ActionBar.p6 I1;
    public int J1;

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        if (this.G1) {
            hashSet.add(Integer.valueOf(this.H1));
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int w02;
        try {
            if (this.G1 && (w02 = org.telegram.ui.ActionBar.t6.w0(this.H1, this.I1)) != this.J1) {
                this.J1 = w02;
                setCursorColor(w02);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void z(int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        this.G1 = true;
        this.H1 = i10;
        this.I1 = p6Var;
        int w02 = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
        this.J1 = w02;
        setCursorColor(w02);
    }
}
