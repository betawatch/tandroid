package org.telegram.ui.Components;

import java.util.HashSet;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public class b5 extends EditTextBoldCursor implements org.telegram.ui.ActionBar.b6 {
    public boolean M1;
    public int N1;
    public org.telegram.ui.ActionBar.h6 O1;
    public int P1;

    public final void A(int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        this.M1 = true;
        this.N1 = i7;
        this.O1 = h6Var;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        this.P1 = w02;
        setCursorColor(w02);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        if (this.M1) {
            hashSet.add(Integer.valueOf(this.N1));
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int w02;
        try {
            if (this.M1 && (w02 = org.telegram.ui.ActionBar.m6.w0(this.N1, this.O1)) != this.P1) {
                this.P1 = w02;
                setCursorColor(w02);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
