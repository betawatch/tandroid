package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class fx extends c5.a {
    public final /* synthetic */ ly c;

    public fx(ly lyVar) {
        this.c = lyVar;
    }

    @Override // c5.a
    public final void a(c5.l lVar, Object obj) {
        lVar.removeView((View) obj);
    }

    @Override // c5.a
    public final int b() {
        return this.c.e.size();
    }

    @Override // c5.a
    public final CharSequence d(int i7) {
        if (i7 == 0) {
            return org.telegram.messenger.hd.M0(2131751196, null);
        }
        if (i7 == 1) {
            return org.telegram.messenger.hd.M0(2131754879, null);
        }
        if (i7 != 2) {
            return null;
        }
        return org.telegram.messenger.hd.M0(2131754756, null);
    }

    @Override // c5.a
    public final Object e(c5.l lVar, int i7) {
        FrameLayout frameLayout = ((hy) this.c.e.get(i7)).b;
        lVar.addView(frameLayout);
        return frameLayout;
    }

    @Override // c5.a
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
