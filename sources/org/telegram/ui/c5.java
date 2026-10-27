package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class c5 {
    public final b5 a = new b5(this);
    public final NotificationCenter b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object c;
    public final int d;
    public final int e;
    public bi.y7 f;
    public boolean g;

    public c5(int i10, TLObject tLObject, int i11) {
        this.c = tLObject;
        this.d = i10;
        this.e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
