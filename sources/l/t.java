package l;

import android.widget.PopupWindow;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class t implements PopupWindow.OnDismissListener {
    public final /* synthetic */ v a;

    public t(v vVar) {
        this.a = vVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.c();
    }
}
