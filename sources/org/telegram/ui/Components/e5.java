package org.telegram.ui.Components;

import java.util.HashSet;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public class e5 extends EditTextBoldCursor implements org.telegram.ui.ActionBar.b6 {
    public boolean b;
    public int c;
    public org.telegram.ui.ActionBar.g6 d;
    public int e;

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        if (this.b) {
            hashSet.add(Integer.valueOf(this.c));
        }
    }

    public final void i(int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        this.b = true;
        this.c = i10;
        this.d = g6Var;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        this.e = w02;
        setCursorColor(w02);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int w02;
        try {
            if (this.b && (w02 = org.telegram.ui.ActionBar.k6.w0(this.c, this.d)) != this.e) {
                this.e = w02;
                setCursorColor(w02);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
