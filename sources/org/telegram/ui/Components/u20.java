package org.telegram.ui.Components;

import java.util.Comparator;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class u20 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.vp b;
    public final /* synthetic */ int c;

    public /* synthetic */ u20(org.telegram.messenger.vp vpVar, int i10, int i11) {
        this.a = i11;
        this.b = vpVar;
        this.c = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x012f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0139 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0143 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ad A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0125 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        switch (this.a) {
            case 0:
                TLObject tLObject = (TLObject) obj;
                TLObject tLObject2 = (TLObject) obj2;
                boolean z10 = tLObject2 instanceof TLRPC.TL_contact;
                org.telegram.messenger.vp vpVar = this.b;
                TLRPC.User Z1 = z10 ? vpVar.Z1(Long.valueOf(((TLRPC.TL_contact) tLObject2).user_id)) : null;
                TLRPC.User Z12 = tLObject instanceof TLRPC.TL_contact ? vpVar.Z1(Long.valueOf(((TLRPC.TL_contact) tLObject).user_id)) : null;
                int i16 = this.c;
                if (Z1 != null) {
                    if (Z1.self) {
                        i10 = i16 + 50000;
                    } else {
                        TLRPC.UserStatus userStatus = Z1.status;
                        if (userStatus != null) {
                            i10 = userStatus.expires;
                        }
                    }
                    if (Z12 != null) {
                        if (Z12.self) {
                            i11 = i16 + 50000;
                        } else {
                            TLRPC.UserStatus userStatus2 = Z12.status;
                            if (userStatus2 != null) {
                                i11 = userStatus2.expires;
                            }
                        }
                        if (i10 > 0 || i11 <= 0) {
                            if (i10 < 0 || i11 >= 0) {
                                if ((i10 < 0 || i11 <= 0) && (i10 != 0 || i11 == 0)) {
                                    if (i11 >= 0 || i10 != 0) {
                                    }
                                }
                            } else if (i10 <= i11) {
                                if (i10 < i11) {
                                }
                            }
                        } else if (i10 <= i11) {
                            if (i10 < i11) {
                            }
                        }
                    }
                    i11 = 0;
                    if (i10 > 0) {
                    }
                    if (i10 < 0) {
                    }
                    if (i10 < 0) {
                    }
                    if (i11 >= 0) {
                    }
                }
                i10 = 0;
                if (Z12 != null) {
                }
                i11 = 0;
                if (i10 > 0) {
                }
                if (i10 < 0) {
                }
                if (i10 < 0) {
                }
                if (i11 >= 0) {
                }
                break;
            case 1:
                Long valueOf = Long.valueOf(((TLRPC.TL_contact) obj2).user_id);
                org.telegram.messenger.vp vpVar2 = this.b;
                TLRPC.User Z13 = vpVar2.Z1(valueOf);
                TLRPC.User Z14 = vpVar2.Z1(Long.valueOf(((TLRPC.TL_contact) obj).user_id));
                int i17 = this.c;
                if (Z13 != null) {
                    if (Z13.self) {
                        i12 = i17 + 50000;
                    } else {
                        TLRPC.UserStatus userStatus3 = Z13.status;
                        if (userStatus3 != null) {
                            i12 = userStatus3.expires;
                        }
                    }
                    if (Z14 != null) {
                        if (Z14.self) {
                            i13 = i17 + 50000;
                        } else {
                            TLRPC.UserStatus userStatus4 = Z14.status;
                            if (userStatus4 != null) {
                                i13 = userStatus4.expires;
                            }
                        }
                        if (i12 > 0 || i13 <= 0) {
                            if (i12 < 0 || i13 >= 0) {
                                if ((i12 < 0 || i13 <= 0) && (i12 != 0 || i13 == 0)) {
                                    if ((i13 < 0 || i12 <= 0) && (i13 != 0 || i12 == 0)) {
                                    }
                                }
                            } else if (i12 <= i13) {
                                if (i12 < i13) {
                                }
                            }
                        } else if (i12 <= i13) {
                            if (i12 < i13) {
                            }
                        }
                    }
                    i13 = 0;
                    if (i12 > 0) {
                    }
                    if (i12 < 0) {
                    }
                    if (i12 < 0) {
                    }
                    if (i13 < 0) {
                    }
                }
                i12 = 0;
                if (Z14 != null) {
                }
                i13 = 0;
                if (i12 > 0) {
                }
                if (i12 < 0) {
                }
                if (i12 < 0) {
                }
                if (i13 < 0) {
                }
                break;
            default:
                Long valueOf2 = Long.valueOf(((TLRPC.TL_contact) obj2).user_id);
                org.telegram.messenger.vp vpVar3 = this.b;
                TLRPC.User Z15 = vpVar3.Z1(valueOf2);
                TLRPC.User Z16 = vpVar3.Z1(Long.valueOf(((TLRPC.TL_contact) obj).user_id));
                int i18 = this.c;
                if (Z15 != null) {
                    if (Z15.self) {
                        i14 = i18 + 50000;
                    } else {
                        TLRPC.UserStatus userStatus5 = Z15.status;
                        if (userStatus5 != null) {
                            i14 = userStatus5.expires;
                        }
                    }
                    if (Z16 != null) {
                        if (Z16.self) {
                            i15 = i18 + 50000;
                        } else {
                            TLRPC.UserStatus userStatus6 = Z16.status;
                            if (userStatus6 != null) {
                                i15 = userStatus6.expires;
                            }
                        }
                        if (i14 > 0 || i15 <= 0) {
                            if (i14 < 0 || i15 >= 0) {
                                if ((i14 < 0 || i15 <= 0) && (i14 != 0 || i15 == 0)) {
                                    if (i15 >= 0 || i14 != 0) {
                                    }
                                }
                            } else if (i14 <= i15) {
                                if (i14 < i15) {
                                }
                            }
                        } else if (i14 <= i15) {
                            if (i14 < i15) {
                            }
                        }
                    }
                    i15 = 0;
                    if (i14 > 0) {
                    }
                    if (i14 < 0) {
                    }
                    if (i14 < 0) {
                    }
                    if (i15 >= 0) {
                    }
                }
                i14 = 0;
                if (Z16 != null) {
                }
                i15 = 0;
                if (i14 > 0) {
                }
                if (i14 < 0) {
                }
                if (i14 < 0) {
                }
                if (i15 >= 0) {
                }
                break;
        }
        return 0;
    }
}
