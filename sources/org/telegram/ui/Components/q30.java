package org.telegram.ui.Components;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q30 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesController b;
    public final /* synthetic */ int c;

    public /* synthetic */ q30(MessagesController messagesController, int i10, int i11) {
        this.a = i11;
        this.b = messagesController;
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
                boolean z4 = tLObject2 instanceof TLRPC.TL_contact;
                MessagesController messagesController = this.b;
                TLRPC.User user = z4 ? messagesController.getUser(Long.valueOf(((TLRPC.TL_contact) tLObject2).user_id)) : null;
                TLRPC.User user2 = tLObject instanceof TLRPC.TL_contact ? messagesController.getUser(Long.valueOf(((TLRPC.TL_contact) tLObject).user_id)) : null;
                int i16 = this.c;
                if (user != null) {
                    if (user.self) {
                        i10 = i16 + 50000;
                    } else {
                        TLRPC.UserStatus userStatus = user.status;
                        if (userStatus != null) {
                            i10 = userStatus.expires;
                        }
                    }
                    if (user2 != null) {
                        if (user2.self) {
                            i11 = i16 + 50000;
                        } else {
                            TLRPC.UserStatus userStatus2 = user2.status;
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
                if (user2 != null) {
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
                MessagesController messagesController2 = this.b;
                TLRPC.User user3 = messagesController2.getUser(valueOf);
                TLRPC.User user4 = messagesController2.getUser(Long.valueOf(((TLRPC.TL_contact) obj).user_id));
                int i17 = this.c;
                if (user3 != null) {
                    if (user3.self) {
                        i12 = i17 + 50000;
                    } else {
                        TLRPC.UserStatus userStatus3 = user3.status;
                        if (userStatus3 != null) {
                            i12 = userStatus3.expires;
                        }
                    }
                    if (user4 != null) {
                        if (user4.self) {
                            i13 = i17 + 50000;
                        } else {
                            TLRPC.UserStatus userStatus4 = user4.status;
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
                if (user4 != null) {
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
                MessagesController messagesController3 = this.b;
                TLRPC.User user5 = messagesController3.getUser(valueOf2);
                TLRPC.User user6 = messagesController3.getUser(Long.valueOf(((TLRPC.TL_contact) obj).user_id));
                int i18 = this.c;
                if (user5 != null) {
                    if (user5.self) {
                        i14 = i18 + 50000;
                    } else {
                        TLRPC.UserStatus userStatus5 = user5.status;
                        if (userStatus5 != null) {
                            i14 = userStatus5.expires;
                        }
                    }
                    if (user6 != null) {
                        if (user6.self) {
                            i15 = i18 + 50000;
                        } else {
                            TLRPC.UserStatus userStatus6 = user6.status;
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
                if (user6 != null) {
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
