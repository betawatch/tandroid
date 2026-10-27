package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class tu0 extends nm0 implements di.o7 {
    public int f3;
    public int g3;
    public int h3;
    public int i3;
    public boolean j3;

    @Override // di.o7
    public final void a(int[] iArr) {
        if (this.j3) {
            iArr[0] = getPaddingTop() - AndroidUtilities.dp(2.0f);
            iArr[1] = getMeasuredHeight() - getPaddingBottom();
        } else {
            iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.h3;
            iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.i3;
        }
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        this.f3 = i11;
        this.g3 = i13;
        super.setPadding(i10, i11, i12, i13);
    }
}
