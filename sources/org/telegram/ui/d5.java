package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class d5 {
    public final c5 a = new c5(this);
    public final NotificationCenter b = NotificationCenter.getInstance(UserConfig.selectedAccount);
    public final Object c;
    public final int d;
    public final int e;
    public gg.m0 f;
    public boolean g;

    public d5(int i10, TLObject tLObject, int i11) {
        this.c = tLObject;
        this.d = i10;
        this.e = i11;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
