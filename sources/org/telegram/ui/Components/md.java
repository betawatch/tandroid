package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class md implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ md(ChatActivityEnterView chatActivityEnterView, int i9) {
        this.a = i9;
        this.b = chatActivityEnterView;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i9 = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (i9) {
            case 0:
                int i10 = ChatActivityEnterView.i5;
                break;
            default:
                ff ffVar = chatActivityEnterView.A0;
                if (ffVar != null && ffVar.length() > 0) {
                    break;
                }
                break;
        }
        return chatActivityEnterView.E0(view);
    }
}
