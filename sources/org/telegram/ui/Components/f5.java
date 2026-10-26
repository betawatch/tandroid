package org.telegram.ui.Components;

import java.util.HashSet;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public class f5 extends EditTextBoldCursor implements org.telegram.ui.ActionBar.p6 {
    public boolean b;
    public int c;
    public org.telegram.ui.ActionBar.u6 d;
    public int e;

    @Override // org.telegram.ui.ActionBar.p6
    public final void addColorKeys(HashSet hashSet) {
        if (this.b) {
            hashSet.add(Integer.valueOf(this.c));
        }
    }

    public final void i(int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        this.b = true;
        this.c = i10;
        this.d = u6Var;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        this.e = w02;
        setCursorColor(w02);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        int w02;
        try {
            if (this.b && (w02 = org.telegram.ui.ActionBar.y6.w0(this.c, this.d)) != this.e) {
                this.e = w02;
                setCursorColor(w02);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
