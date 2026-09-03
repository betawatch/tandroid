package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class b5 {
    public final a5 a = new a5(this);
    public final NotificationCenter b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object c;
    public final int d;
    public final int e;
    public hg.m0 f;
    public boolean g;

    public b5(int i10, TLObject tLObject, int i11) {
        this.c = tLObject;
        this.d = i10;
        this.e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
